import java.util.Objects;


public class Book {

	// PRIVATE MEMBERS
	private String title;
	private String author;
	private boolean hasAuthor;

	// CONSTRUCTORS
	public Book(){};

	public Book(String title, String author) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
		hasAuthor = true;
	}

	public Book(String title) {
		this(title, "<no author>");
		hasAuthor = false;
	}

	// GETTERS / SETTERS
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// METHODES
	@Override
	public boolean equals(Object other) {
		return title.equals(((Book) other).title) &&
				author.equals(((Book) other).author);
	}

	//1
    @Override
    public String toString() {
        return title + (hasAuthor?", " + author:"");
    } 

    //2
    // oui, car cette méthode est définie dans la classe parente Objects

    //3
    // ta daaam
}
