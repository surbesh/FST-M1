package activities;

public class Car {

	 // class variables
    String color;
    String transmission;
     int make;
     int tyres;
     int doors;
     
     // Constructor
  public Car() {
	  
	  tyres=4;
	  doors=4;
  }  

    // Creating Method to display Characteristics
  public void displayCharacterstics(){
		System.out.println("Color of Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of  Car: " + transmission);
		System.out.println("Number of doors on the car: " + doors);
	    	System.out.println("Number of tyres on the car: " + tyres);
	    }

   // Creating Method to show the direction of car  
  public void accelerate() {
		System.out.println("Car is moving forward.");
	    }
	// Creating the Method to display car is stopped	
  public void brake() {
		System.out.println("Car has stopped.");
	    }

}
