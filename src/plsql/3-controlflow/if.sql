/*

In PL/SQL, the IF-THEN statement is used to execute a block of code only when a specified condition evaluates to TRUE.
Every IF block must be closed with the END IF; keyword

*/

--Baisc If elase statement
DECLARE
   v_salary NUMBER := 6000;
BEGIN
   IF v_salary > 5000 THEN
      DBMS_OUTPUT.PUT_LINE('Eligible for standard bonus.');
   END IF;
END;


--IF-THEN-ELSE Statement
DECLARE
   v_age NUMBER := 16;
BEGIN
   IF v_age >= 18 THEN
      DBMS_OUTPUT.PUT_LINE('Eligible to vote.');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Not eligible to vote.');
   END IF;
END;



/*
Critical Rules to Remember
  1. Every single IF requires a matching END IF; statement.
  2. ELSIF has no "E" at the end.
  3. If a condition evaluates to NULL, PL/SQL treats it as FALSE and skips the block.
