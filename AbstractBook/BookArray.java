
public class BookArray {
	
public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
    		
    		Book bookArray[]= new Book [10];
        
        	bookArray[0]= new Fiction ("Black Beauty");
        	bookArray[1]= new Fiction ("Heidi");
        	bookArray[2]= new Fiction ("Treasure Island");
        	bookArray[3]= new Fiction ("Class 3C has a Secret");
        	bookArray[4]= new Fiction ("Hell University");
            bookArray[5]= new NonFiction ("The Road to Wigan Pier");
            bookArray[6]= new NonFiction ("Enemies of Promise");
            bookArray[7]= new NonFiction  ("Testament of Youth");
            bookArray[8]= new NonFiction("The Waste Land");
            bookArray[9]= new NonFiction ("Personal Memoirs");

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0; i< bookArray.length; i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].getBooktitle() + " " + bookArray[i].getBookprice() + "\n" );
        }
    }

}
