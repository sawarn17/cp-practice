/*
  Aggregate functions deep dive in plsqlYou said:
    aggregate functions deep dive in plsqlAn aggregate function summarizes multiple input rows into a single output value. 
    While standard SQL provides common aggregators like SUM and AVG, PL/SQL allows you to extend these capabilities

--Aggregate functions handle NULL values uniquely, which can cause logic bugs if ignored.
  
1. Ignored Values: SUM, AVG, MIN, MAX, and COUNT(column) completely ignore NULL values.
2. The COUNT Exception: COUNT(*) counts every row, including rows that are completely NULL
3. The NVL Fix: Use NVL inside the function if NULL rows must be treated as 0 or a specific baseline

*/

-- If 3 out of 4 employees have a commission of NULL, and one has 500:
SELECT AVG(commission_pct) FROM employees;       -- Result: 500 (Ignores NULLs)
SELECT AVG(NVL(commission_pct, 0)) FROM employees; -- Result: 125 (Counts NULLs as 0)


--Advanced Analytical & String Aggregation
--String Aggregation (LISTAGG)
