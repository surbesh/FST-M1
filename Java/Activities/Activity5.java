package activities;

public class Activity5 {
	
	public static void main(String []args) {
	  //Initialize title of the book
    String title = "Kalpavrukshada Kamadhenu";
    //Create object for MyBook
    Book sBook = new MyBook();
    //Set title
    sBook.setTitle(title);
    
    String stitle = sBook.getTitle();
    
    System.out.println("Title of the book is " +stitle);
    
    
   
}

}
