# Write your MySQL query statement below

SELECT C.class FROM Courses AS C
GROUP BY C.class
HAVING COUNT(C.class) >= 5;