package activities;

//  Creating the class
class Activity3 {
	// Main method
    public static void main(String args[]) {
        // creating a variable and initializing   	
        double dseconds = 1000000000;
        double dEarthSeconds = 31557600;
        double dMercurySeconds = 0.2408467;
        double dVenusSeconds = 0.61519726;
        double dMarsSeconds = 1.8808158;
        double dJupiterSeconds = 11.862615;
        double dSaturnSeconds = 29.447498;
        double dUranusSeconds = 84.016846;
        double dNeptuneSeconds = 164.79132;
        
        // Calculating the age of the planets and Printing
        System.out.println("Age on Mercury: " + dseconds / dEarthSeconds / dMercurySeconds);
        System.out.println("Age on Venus: " + dseconds / dEarthSeconds / dVenusSeconds);
        System.out.println("Age on Earth: " + dseconds / dEarthSeconds);
        System.out.println("Age on Mars: " + dseconds / dEarthSeconds / dMarsSeconds);
        System.out.println("Age on Jupiter: " + dseconds / dEarthSeconds / dJupiterSeconds);
        System.out.println("Age on Saturn: " + dseconds / dEarthSeconds / dSaturnSeconds);
        System.out.println("Age on Uranus: " + dseconds / dEarthSeconds / dUranusSeconds);
        System.out.println("Age on Neptune: " + dseconds / dEarthSeconds / dNeptuneSeconds);
    }
}