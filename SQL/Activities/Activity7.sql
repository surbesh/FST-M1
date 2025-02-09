-- SQL statement to find the total purchase amount of all orders.
select SUM(purchase_amount) AS "Total Sum" from orders;

-- SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) AS "Average" from orders;

-- SQL statement to get the maximum purchase amount of all the orders.
select MAX(purchase_amount) AS "Maximum" from orders;

-- SQL statement to get the minimum purchase amount of all the orders.
select MIN(purchase_amount) AS "Minimum" from orders;

-- SQL statement to find the number of salesmen listed in the table.
select COUNT(distinct salesman_id) AS "Total Count" from orders;