
public class NonFiction extends Book {
	
	public NonFiction(String booktitle) {
        super(booktitle);
        setPrice();
    }

    @Override
    void setPrice() {
        bookprice= 37.99;
    }

}
