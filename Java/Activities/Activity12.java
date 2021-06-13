package activities;

public class Activity12 {
    public static void main(String[] args) {
        // Lambda expression without return keyword.
	   Addable iadd1 = (a,b) -> (a + b);
	   System.out.println(iadd1.add(12, 14));
	   
       Addable iadd2 = (int a, int b) -> {
    	   return (a + b);
	   };
	   System.out.println(iadd2.add(1000, 2000));
    }

}
