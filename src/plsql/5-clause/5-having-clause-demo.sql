/*
The HAVING clause in PL/SQL (and standard Oracle SQL) filters data after aggregation has occurred. 
While the WHERE clause filters individual rows before grouping, HAVING filters group rows based on aggregate functions like SUM, COUNT, AVG, MAX, or MIN
*/


/*
Core Syntax & Execution Order

------****The HAVING clause is always paired with the GROUP BY clause.

SQL Execution OrderUnderstanding the internal execution order is critical for writing efficient queries:
  1. FROM: Gathers data from the tables.
  2. WHERE: Filters raw rows before grouping.
  3. GROUP BY: Groups the remaining rows into summaries.
  4. HAVING: Filters the summarized groups after aggregation.
  5. SELECT: Projects the final columns.
  6. ORDER BY: Sorts the final output.

*/

    SELECT id, MAX(LOAN_AMOUNT_REQUESTED) AS max_Amt
    FROM elm.x_sell
    GROUP BY id
    HAVING AVG(LOAN_AMOUNT_REQUESTED) > 50000 order by id desc limit 50


--with where caluse 
    SELECT id, MAX(LOAN_AMOUNT_REQUESTED) AS max_Amt
    FROM elm.x_sell
    where status='DISBURSHED'
    GROUP BY id
    HAVING AVG(LOAN_AMOUNT_REQUESTED) > 50000 order by id desc limit 50




