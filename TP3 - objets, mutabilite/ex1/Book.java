// javac Book.java && java Book

public class Book {
	//1
	private String title;
	private String author;

	//2
	public static void main(String[] args) {
		var book = new Book();
		System.out.println(book.title + ' ' + book.author);
	}
	// retourne "null null" 
	// -> les membres objets (String) des objets sont initialisés à null 
	// on peut accéder aux membres privés car on est dans la class.

	//7
	public Book(){};

	// public Book(String ptitle, String pauthor) {
	// 	title = ptitle;
	// 	author = pauthor;
	// }

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// 8

	// problème : comment identifier le title des paramètres et celui de l'objet ?
	// soluion : this.[nomdevariable] désigne la var de l'objet
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	//9
	// public Book(String title) {
	// 	this.title = title;
	// 	author = "<no authour>";
	// }

	//10 
	// en fonction du nombre et du type des arguments, 
	// le compilateur sait quel constructeur appeler (principe de surcharge de méthode) 

	// 11
	public Book(String title) {
		this(title, "<no author>");
	}
}
