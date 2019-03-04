package tp4;
//EX2
public class ArrayShoppingCart {

	
	// MEMBERS
	private int maxBooks;
	Book[] books;
	private int nbBooks;
	
	//CONSTRUCTORS
	public ArrayShoppingCart(int maxBooks) {
		this.maxBooks = maxBooks;
		this.books = new Book[maxBooks];
	}

	//METHODS
	public void Add(Book book) throws Exception {
		if (nbBooks >= maxBooks) {
			throw new Exception("can't add new book - maximum number of books in cart reached !");
		}
		books [nbBooks] = book;
		nbBooks ++;
	}

    @Override
    public String toString() {
    	StringBuilder out = new StringBuilder();
			out.append("Array cart : " + nbBooks + " / " + maxBooks + " books");
		for (int i = 0; i < nbBooks; i++) {
			out.append("\n - " + books[i].toString());
		}
		return new String(out);
	}
    
    public void printContent() {
    	System.out.println(toString());
    }
    
    public Book longestTitle() {
    	int idLongest = -1;
    	for (int i = 0; i < nbBooks; i++) {
    		if (idLongest == -1 || books[idLongest].getTitle().length() <= books[i].getTitle().length()) {
    			idLongest = i;
    		}
    	}
    	if (idLongest == -1) {
    		return null;
    	}
    	return books[idLongest];
    	
    }
    
}

//1
// non, sinon toutes les instances de caddie ont un max de livres commun défini

//2
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//at tp4/tp4.ArrayShoppingCart.Add(ArrayShoppingCart.java:19)
//at tp4/tp4.ArrayShoppingCartTest.main(ArrayShoppingCartTest.java:13)

//gérer les exceptions