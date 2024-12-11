-- Create database if not exists
CREATE DATABASE IF NOT EXISTS hrms;

-- Use the hrms database
USE hrms;

-- Create Employee table
CREATE TABLE IF NOT EXISTS Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,  -- Auto Increment ID
    name VARCHAR(100) NOT NULL,         -- Employee Name
    designation VARCHAR(50) NOT NULL,   -- Employee Designation
    salary FLOAT NOT NULL,              -- Employee Salary
    join_date DATE DEFAULT CURRENT_DATE -- Join Date with default current date
);

-- Sample Employee data (optional)
INSERT INTO Employee (name, designation, salary) 
VALUES 
    ('John Doe', 'Software Engineer', 60000),
    ('Jane Smith', 'HR Manager', 70000),
    ('Sam Brown', 'Sales Manager', 50000);
