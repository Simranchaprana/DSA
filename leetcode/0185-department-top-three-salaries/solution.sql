# Write your MySQL query statement below
select d.name as department, e.name as employee, e.salary 
from employee e 
join department d ON e.departmentId = d.id
where (SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId 
      AND e2.salary > e.salary
) < 3
ORDER BY d.name, e.salary DESC;


