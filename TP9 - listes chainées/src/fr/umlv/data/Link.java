package fr.umlv.data;

class Link {

	// MEMBERS
	private Object value;
	private Link next;
	
	/// CONSTRUCTOR
	Link (Object value) {
		this.value = value;
		next = null;
	}
	
	// GETTERS SETTERS
	Object getValue() {
		return value;
	}

	void setValue(Object value) {
		this.value = value;
	}

	Link getNext() {
		return next;
	}


	void setNext(Link next) {
		this.next = next;
	}

	// METHODS
	@Override
	public String toString() {
		return "Link [value=" + value + ", next=" + next + "]";
	}
}

// 1.1
// Link est package, ses champs sont privés, ses méthodes package

// 1.2
// pour compiler : javac 