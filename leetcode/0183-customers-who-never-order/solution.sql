# Write your MySQL query statement below
select c.name as CUSTOMERS
from Customers  c
left join Orders o
on c.id=o.customerId
where o.customerId is NULL;



