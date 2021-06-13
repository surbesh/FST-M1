package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializing the array in the random order
		 int[] iNum = { 28, 24, 20, 13, 12 };
	         sorting(iNum);
	        System.out.println("Sorting in ascending Order: ");
	        System.out.println(Arrays.toString(iNum));
	    }

	private static void sorting(int array[]) {
		// TODO Auto-generated method stub
		
		int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
		
	}

	}


