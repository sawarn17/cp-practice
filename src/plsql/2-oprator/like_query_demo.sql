-- Syntax Pattern
SELECT column_name FROM table_name WHERE column_name LIKE 'pattern';


/*
  Pattern Type:
    LIKE 'tech%': Matches strings starting with "tech" (e.g., "technology", "tech").
    LIKE '%com': Matches strings ending with "com" (e.g., "dotcom", "welcome").
    LIKE '%or%': Matches strings containing "or" in any position (e.g., "for", "portal").
    LIKE '_at': Matches exactly three-letter strings ending in "at" (e.g., "cat", "bat").
*/

--by Default like is case insensetive in the psql until unless we can maunally not set it to be.
