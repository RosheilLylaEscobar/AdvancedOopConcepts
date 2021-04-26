
public class Fiction extends Book {
	
	public Fiction(String booktitle) {
        super(booktitle);
        setPrice();
    }

    @Override
    void setPrice() {
        bookprice= 24.99;
    }

}
