# Write your MySQL query statement below
SELECT name AS Customers  FROM Customers c
LEFT JOIN Orders as o
ON c.id = o.customerId
WHERE o.customerId IS NULL;
