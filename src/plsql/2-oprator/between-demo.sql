/*

The MySQL BETWEEN operator filters query results by checking if a value falls within a closed range. It is inclusive, 
meaning it evaluates to 1 (true) if the value is greater than or equal to the minimum value and less than or equal to the maximum value


Logical Equivalence & AST RepresentationBehind the scenes, the MySQL Optimizer parses the BETWEEN operator into a standard compound logical comparison.
During Abstract Syntax Tree (AST) creation, the transformation is direct:
*/
-- What you write:
WHERE column_name BETWEEN min_value AND max_value

-- How MySQL executes it:
WHERE (column_name >= min_value) AND (column_name <= max_value)



--Not Between oprator is inversion
-- What you write:
WHERE column_name NOT BETWEEN min_value AND max_value

-- How MySQL executes it:
WHERE (column_name < min_value) OR (column_name > max_value)



/*
Indexing & Execution PlansBETWEEN interacts cleanly with MySQL B-Tree indexes,making range filtering highly performant.
  1. Single-Column Index Range ScanIf an index exists on salary, running WHERE salary BETWEEN 50000 AND 80000 prompts the optimizer 
     to perform an Index Range Scan (type: range in EXPLAIN).

    The storage engine navigates directly to the leaf node matching 50000.
    It reads sequentially along the leaf node linked-list pointer.
    It halts execution the millisecond it hits a value greater than 80000.

 2. Composite Indexes (The Multi-Column Rule)When building composite (multi-column) indexes, range conditions break index utility for subsequent columns.
    Consider a composite index defined on (company_id, status, created_at)

-- Query A: Equality conditions followed by a range condition
SELECT * FROM orders 
WHERE company_id = 5 
  AND status = 'active' 
  AND created_at BETWEEN '2026-01-01' AND '2026-01-31';
-- Optimizer Behavior: Highly efficient. All three index columns are fully utilized.


-- Query B: Range condition placed before equality columns
SELECT * FROM orders 
WHERE company_id BETWEEN 1 AND 5 
  AND status = 'active';
-- Optimizer Behavior: The index is utilized for company_id range tracking. 
-- However, because company_id is a range, the sorting order of 'status' becomes scrambled across those mixed blocks. 
-- The index cannot be used to filter 'status'; MySQL must perform an engine-level filter (Using where).

