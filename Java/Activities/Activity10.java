package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
    	
        HashSet<String> hs = new HashSet<String>();
        
        // Adding element to HashSet
  	
        hs.add("L");
	    hs.add("M");
	    hs.add("K");
	    hs.add("X");
	    hs.add("P");
	    hs.add("A");
	    
        //Print HashSet
	   System.out.println("Original HashSet: " + hs);        
	
        //Print size of HashSet
	   System.out.println("Size of HashSet: " + hs.size());
	    //Remove element
	    System.out.println("Removing X from HashSet: " + hs.remove("X"));
	    //Remove element that is not present
	    if(hs.remove("Z")) {
	    	System.out.println("Z removed from the Set");
	    } else {
	    	System.out.println("Z is not present in the Set");
	    }
	    //Search for element
	    System.out.println("Checking if P is present: " + hs.contains("P"));
	    //Print updated HashSet
	    System.out.println("Updated HashSet: " + hs);
    }
}
