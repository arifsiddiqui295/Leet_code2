# Write your MySQL query statement below
SELECT unique_id,name FROM Employees  as eu
LEFT JOIN EmployeeUNI as e ON e.id= eu.id;