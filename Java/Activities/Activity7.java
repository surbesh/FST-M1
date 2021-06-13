package activities;

public class Activity7 {

	public static void main(String agrs []) {
		
		 MountainBike mb = new MountainBike(3, 0, 25);
	        System.out.println("Description is "+mb.bicycleDesc());
	        mb.speedUp(20);
	        mb.applyBrake(5);
	}
	
	
}
