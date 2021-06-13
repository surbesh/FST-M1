package activities;

class Bicycle implements  BicycleParts {

	 public int gears;
	 public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
	
	public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed increment: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed decrement: " + currentSpeed);
    }

    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }



}
