

CREATE TABLE employees (
    emp_id     NUMBER PRIMARY KEY,                  -- Primary Key
    email      VARCHAR2(100) NOT NULL UNIQUE,       -- Not Null and Unique
    salary     NUMBER CHECK (salary > 0)            -- Check condition
);
