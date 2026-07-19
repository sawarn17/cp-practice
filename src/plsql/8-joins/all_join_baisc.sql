
/*
In PL/SQL and standard Oracle SQL, a JOIN is used to combine rows from two or more tables based on a related column between them.



----------------------------------------------------------------------------------------------------------------
Join TypeDescriptionMatches Required:
  INNER JOIN : Returns rows with matching values in both tables.
  LEFT OUTER JOIN : Returns all rows from left table + matches from right.(Left guaranteed)
  RIGHT OUTER JOIN : Returns all rows from right table + matches from left. (Right guaranteed)
  FULL OUTER JOIN : Returns all rows when there is a match in either table.(All guaranteed)
  CROSS JOIN : Returns the Cartesian product (all possible combinations).
  NATURAL JOIN : Automatically joins based on columns with identical names.
  SELF JOIN : Joins a table to itself to evaluate hierarchical data.Dependent on logic
*/


--------Inner Join : Default Type of Join ---------------------
    SELECT emp.employee_id, dept.department_name
    FROM employees emp
    INNER JOIN departments dept 
    ON emp.department_id = dept.department_id;


--LEGACY PLSQL
    SELECT emp.employee_id, dept.department_name
    FROM employees emp, departments dept
    WHERE emp.department_id = dept.department_id;

-----------------------------------------------------------------
/*
--Left JOIN
  The LEFT JOIN returns all records from the left table, and the matched records from the right table. 
  If no match is found, NULL values are returned for the right table's columns.
*/

  SELECT emp.first_name, dept.department_name
  FROM employees emp
  LEFT OUTER JOIN departments dept 
  ON emp.department_id = dept.department_id;

------------------------------------------------------------------------------------------

-- Returns ALL departments, even if no employees work in them (shows NULL).
SELECT e.name, d.dept_name 
FROM emp e 
RIGHT JOIN dept d ON e.dept_id = d.dept_id;

---------------------------------------------------------------------------------------------
-- Returns ALL employees and ALL departments, matching data where possible.
SELECT e.name, d.dept_name 
FROM emp e 
FULL JOIN dept d ON e.dept_id = d.dept_id;

---------------------------------------------------------------------------------------------
-- Multiplies tables to pair every single employee with every single department.
SELECT e.name, d.dept_name 
FROM emp e 
CROSS JOIN dept d;

----------------------------------------------------------------------------------------------
-- Automatically joins tables using columns that share the exact same name.
SELECT name, dept_name 
FROM emp 
NATURAL JOIN dept;

----------------------------------------------------------------------------------------------
-- Automatically joins tables using columns that share the exact same name.
SELECT name, dept_name 
FROM emp 
NATURAL JOIN dept;




