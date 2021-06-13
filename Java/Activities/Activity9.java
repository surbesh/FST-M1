package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		// adding objects to array list
		myList.add("Ganga");
		myList.add("Yamuna");
		myList.add("Kaveri");
		
		//adding object to sepcific list
		myList.add(3, "Saraswathi");
		myList.add(0, "Brahmaputra");
		// To print all the list
		
        for(String s:myList){
        	  System.out.println(s);
	        }
		
        System.out.println("3rd element of the list is: " + myList.get(2));
    	System.out.println("Is Yamuna river in list: " + myList.contains("Yamuna"));
	    System.out.println("Size of ArrayList: " + myList.size());
	    myList.remove("Ganga");
	    System.out.println("New Size of ArrayList: " + myList.size());

	}

}
