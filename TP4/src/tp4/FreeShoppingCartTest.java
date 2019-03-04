package tp4;

public class FreeShoppingCartTest {
	public static void main(String[] args) {
		System.out.println("beginng of the test program");
		FreeShoppingCart cart = new FreeShoppingCart();
		Book a = new Book("book", "alice");
		Book b = new Book("long book", "bob");
		cart.Add(a);
		cart.Add(a);
		cart.Add(a);
		cart.Add(b);
		cart.Add(a);
		cart.Add(a);
		
		cart.printContent();

		System.out.println(cart.longestTitle().getTitle());

		System.out.println("end of the test program");
	}

}
