--181. Employees Earning More Than Their Managers
--------------------------------------------------------------------------
--Table: Employee

--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| name        | varchar |
--| salary      | int     |
--| managerId   | int     |
--+-------------+---------+
--id is the primary key (column with unique values) for this table.
--Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.
---------------------------------------------------------------------------------------------------------------
select E.name as Employee from Employee E 
join 
Employee M
on M.id = E.managerId
where
E.salary>M.salary; 
