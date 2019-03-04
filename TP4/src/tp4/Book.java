package tp4;

import java.util.Objects;

public class Book {

	// MEMBERS
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

    @Override
    public String toString() {
        return title + (hasAuthor?", " + author:"");
    } 
}