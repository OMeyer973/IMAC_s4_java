package tp4;

public class ArrayShoppingCartTest {

	public static void main(String[] args) {
		System.out.println("beginng of the test program");
		ArrayShoppingCart cart = new ArrayShoppingCart(5);
		Book a = new Book("book", "alice");
		Book b = new Book("long book", "bob");
		try {
		cart.Add(a);
		cart.Add(a);
		cart.Add(a);
		cart.Add(b);
		cart.Add(a);
		cart.Add(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		cart.printContent();

		System.out.println(cart.longestTitle().getTitle());

		System.out.println("end of the test program");
	}


	
}
