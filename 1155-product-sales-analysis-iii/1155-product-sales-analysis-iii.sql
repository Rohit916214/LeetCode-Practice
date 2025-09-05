
-- It Gives TLE

/*
SELECT  p1.product_id, p1.year AS first_year, p1.quantity, p1.price FROM Sales AS p1
WHERE p1.year = (
    SELECT MIN(year) FROM Sales
    WHERE product_id = p1.product_id
);

*/


SELECT  p1.product_id, p1.year AS first_year, p1.quantity, p1.price FROM Sales AS p1
JOIN(
    SELECT product_id , MIN(year) AS first_year FROM Sales
    GROUP BY product_id
)  AS p2
ON p1.product_id = p2.product_id AND p1.year = p2.first_year;


