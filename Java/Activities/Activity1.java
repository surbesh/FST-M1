package activities;

// Class Name
public class Activity1 {
	
	// Main Method
	public static void main(String[] args) {
		
	//Create an Object for Car
	Car carName = new Car();
	
	//Add values to variables
	carName.make=2014;
	carName.color="Black";
	carName.transmission="Manual";
	
    //Using Car class method
    carName.displayCharacterstics();
    carName.accelerate();
    carName.brake();	
	
	}
}