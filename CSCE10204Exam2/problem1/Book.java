package problem1;

public class Book {
	private String title;
	private String author;
	private double price;
	public Book () {
		title = "Unknown";
		author = "Unknown";
		price = 0.00;
		
	}
	public Book (String title, String author, double price) {
		this.title = title;
		this.author = author;
		setPrice(price);
	}
	public String getTitle () {
		return title;
	}
	public void setTitle (String Title) {
		this.title = title;
	}
	public String getAuthor () {
		return author;
	}
	public void setAuthor (String Author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice (double price) {
		if (price >=0.00 && price <= 200.00) {
			this.price = price;
			
		}
	}
	public void show() {
		System.out.println ("Title" + title);
		System.out.println("Author" + author);
		System.out.println("Price" + price);
	}

}
