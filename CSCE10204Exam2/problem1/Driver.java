package problem1;

public class Driver {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Java Programming", "Thu Le", 99.00);
		book1.show();
		System.out.println();
		book2.show();
		System.out.println();
		
		book1.setTitle("Java Programming");
		book1.setAuthor("Thu Le");
		book1.setPrice(50.00);
		
		book1.show ();
		
		book2.setPrice(250.00);
		System.out.println();
		book2.show();
		
		

	}

}
