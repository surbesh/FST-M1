package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	       // this is a charted plane with 8 passengers
	        Plane plane = new Plane(8);
	        //Add passengers on the list
	        plane.onboard("Rayaaru");
	        plane.onboard("Prashanth");
	        plane.onboard("Reddy");
	        plane.onboard("Rama");
	        plane.onboard("Namitha");
	        plane.onboard("Jyoth");
	        
	        
	        //Plane takes off
	        System.out.println("Plane took off at: " + plane.takeOff());
	        //Print list of people on board
	        System.out.println("People on the plane: " + plane.getPassengers());
	        //Flying in the air.....
	        Thread.sleep(5000);
	        //Plane has grounded
	        plane.ground();
	        //Plane grounded
	        System.out.println("Plane grounded at: " + plane.getLastTimeLanded());
	        System.out.println("People on the plane after grounded: " + plane.getPassengers());
	    

	}

}
