
public abstract class Book {
	
	public String booktitle;
    public double bookprice;

    public Book(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public double getBookprice() {
        return bookprice;
    }

    abstract void setPrice();

}
