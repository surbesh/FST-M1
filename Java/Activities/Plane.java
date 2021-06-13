package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTakeOff;
    private Date lastTimeGrounded;
    
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTakeOff = new Date();
        return lastTimeTakeOff;
    }

    public void ground() {
        this.lastTimeGrounded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeGrounded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
    
    
    
}
