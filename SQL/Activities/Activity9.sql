-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);
    
    //Inserting data
    
    insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001); 
insert into customers values (3007, ('Brad Davis', 'New York', 200, 5001);
insert into customers values (3005, 'Graham Zusi', 'California', 200, 5002); 
insert into customers values (3008, 'Julian Green', 'London', 300, 5002);
insert into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006); 
insert into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003);
insert into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007);
insert into customers values (3001, 'Brad Guzan', 'London', 300, 5005);



//// SQL statement to know which salesman are working for which customer.
SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

// SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
salesman_name

// Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
salesman_name

// Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
salesman_name