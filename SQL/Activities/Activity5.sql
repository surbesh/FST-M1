   // Update the grade score of salesmen from Rome to 200.
Update salesman set grade=200 where salesman_city='Rome';
    //Update the grade score of James Hoog to 300.
Update salesman set grade=300 where salesman_name='James Hoog';
//Update the name McLyon to Pierre.
Update salesman set salesman_name='Pieree' where salesman_name='McLyon';


select * from salesman;