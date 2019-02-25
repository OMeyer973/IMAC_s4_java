import java.util.Objects;


public class Book {

	// PRIVATE MEMBERS
	private String title;
	private String author;

	// CONSTRUCTORS
	public Book(){};

	public Book(String title, String author) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
	}
	public Book(String title) {
		this(title, "<no author>");
	}

	// GETTERS / SETTERS
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// METHODES
	//2
	// returns true if the content of the other book is the same as the current one
	
	// public boolean equals(Book other) {
	// 	return title.equals(other.title) && 
	// 			author.equals(other.author);
	// }

	//6 7
	@Override
	public boolean equals(Object other) {
		return title.equals(((Book) other).title) &&
				author.equals(((Book) other).author);
	}

	// 8
	// override indique qu'on veut redéfinir 
	// la méthode parente ayant la m^eme signature 
	// (ici Object.equals(Object))

}
