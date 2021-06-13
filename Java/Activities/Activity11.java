package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    	
        hash_map.put(1, "Yellow");
	    hash_map.put(2, "Orange");
	    hash_map.put(3, "Pink");
	    hash_map.put(4, "Violet");
	    hash_map.put(5, "Blue");
	    
	
	    // Print the Map
	    System.out.println("The Original map: " + hash_map);
	
        // Remove one colour
	    hash_map.remove(4);
	
        // Map after removing a colour
	    System.out.println("After removing Violet: " + hash_map);
	    // Check if green exists
	    if(hash_map.containsValue("Orange")) {
	        System.out.println("Orange exists in the Map");
	    } else {
	
            System.out.println("Orange does not exist in the Map");
	
        }
        // Print the size of the Map
	
        System.out.println("Number of pairs in the Map is: " + hash_map.size());
	
    }

	}

