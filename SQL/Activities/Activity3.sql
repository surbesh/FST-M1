//Show data from the salesman_id and salesman_city columns
Select salesman_id,salesman_city from salesman;

//Show data of salesman from Paris
Select * from salesman where salesman_city='Paris';

//Show salesman_id and commission of Paul Adam
Select salesman_id,commission from salesman where salesman_name='Paul Adam';
