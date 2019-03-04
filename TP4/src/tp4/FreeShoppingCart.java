package tp4;
//EX3
import java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	
	// MEMBERS
	private ArrayList<Book> books;	

	//CONSTRUCTORS
	public FreeShoppingCart() {
		this.books = new ArrayList<Book>(); 
	}

	//METHODS
	public void Add(Book book) {
		books.add(book);
	}

    @Override
    public String toString() {
    	StringBuilder out = new StringBuilder();
			out.append("Free cart : " + books.size()  + " books");
		for (int i = 0; i < books.size(); i++) {
			out.append("\n - " + books.get(i).toString());
		}
		return new String(out);
	}
    
    public void printContent() {
    	System.out.println(toString());
    }
    //2
	//public Book longestTitle() {
	//	int idLongest = -1;
	//	for (int i = 0; i < books.size(); i++) {
	//		if (idLongest == -1 || books.get(idLongest).getTitle().length() <= books.get(i).getTitle().length()) {
	//			idLongest = i;
	//		}
	//	}
	//	if (idLongest == -1) {
	//		return null;
	//	}
	//	return books.get(idLongest);
	//}

    //3
  //public Book longestTitle() {
  	//	  Book longestBook = null;
  	//	  Iterator<Book> itr = books.iterator();
  	//	  while (itr.hasNext()) {
  	//		  Book currBook = itr.next();
  	//		  if (longestBook == null || longestBook.getTitle().length() <= currBook.getTitle().length()) {
  	//			  longestBook = currBook;
  	//		  }
  	//	  }
  	//	  return longestBook;
  	//}
    
    //4
	public Book longestTitle() {
  	    Book longestBook = null;
	    for (Book b : books) {
	    	if (longestBook == null || longestBook.getTitle().length() <= b.getTitle().length()) {
	    		longestBook = b;
	    	}
	    }
	    return longestBook;
	}
	//foreach est plus optimisé sur les collections que sur les tableaux

	//5
	//worst case complexity : n
//	public void removeFirstOccurence(Book bookToFind) {
//	    for (int i = 0; i < books.size(); i++) {
//	    	if (books.get(i).equals(bookToFind)) {	    		
//	    		books.remove(i);
//	    		return;
//	    	}
//		}
//	}
	
	//worst case complexity : n
//	public void removeFirstOccurence(Book bookToFind) {
//    Iterator<Book> itr = books.iterator();
//    while (itr.hasNext()) {
//	    Book currBook = itr.next();
//    	if (currBook.equals(bookToFind)) {	    		
//    		currBook.remove();
//    		return;
//    	}
//	  }
//  }
	
	
	// la vraie méthode qu'on utilise c'est celle là
	public void removeFirstOccurence(Book bookToFind) {
		books.remove(bookToFind);
	}


	//7 
	// on utilise une bouclue foreach quand on veut juste parcourir
	// une arraylist. quand on veut modifier (supprimer) des éléments,
	// il est plus sûr d'utiliser des itérateurs
	// https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java

}

    
