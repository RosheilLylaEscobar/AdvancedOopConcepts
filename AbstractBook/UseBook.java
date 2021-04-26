
public class UseBook {
	
	public static void main (String [] args)
	{
	
		Book book;
		System.out.print("Name of Fiction Book: ");
		book = new Fiction ("Black Beauty");
		System.out.println(book.getBooktitle() + " for $" + book.getBookprice());
		
		System.out.print("Name of the Non Fiction Book: ");
		book = new NonFiction (" On Liberty");
		System.out.println(book.getBooktitle() + " for $" + book.getBookprice());
	}

}
