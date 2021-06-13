package activities;

import java.util.*;

public class Activity2 {
	// Main Method
	public static void main(String[] args) {
	// Initializing the array	
	int arr[]= {10,77,10,54,-11,10};
	
	
    
    //Data provided
    int iNum = 10;
    int iSum = 30;

    //Print result
    System.out.println("Result: " + result(arr, iNum, iSum));
}
// Create method to validate the numbers
public static boolean result(int[] numbers, int iNum, int iSum) {
    int itempsum = 0;
    //Loop through array
    for (int number : numbers) {
    	
        // checking value for 10
        if (number == iNum) {
            //Add them
        	itempsum += iNum;
        }

        //Sum added should not be more than 30
        if (itempsum > iSum) {
            break;
        }
    }

    //Return true if condition are satisfied
    return itempsum == iSum;

}
}