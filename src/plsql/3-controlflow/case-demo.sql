/*

It is just like a switch case in java
A CASE statement in PL/SQL evaluates a condition and returns a specific value or executes a sequence of statements. 
It comes in two primary types: the CASE Expression (returns a value) and the CASE Statement (controls execution flow)

*/

-- WRONG (Will skip to ELSE)
CASE v_status
    WHEN NULL THEN 'Unknown status' 
    ELSE 'Valid status'
END;

-- CORRECT
CASE 
    WHEN v_status IS NULL THEN 'Unknown status'
    ELSE 'Valid status'
END;


/*
PL/SQL evaluates WHEN clauses sequentially from top to bottom. Once a condition evaluates to TRUE, 
  it executes the corresponding block and skips the rest. 
Place your most frequent or highest-probability conditions at the top to optimize performance

*/
