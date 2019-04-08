package fr.umlv.data;

public class LinkedLink<T> {

	private Link first;

	public LinkedLink() {};
	
	public void add(T newValue) {
		Link newLink = new Link(newValue);
		newLink.setNext(first);
		first = newLink;
	}
	
	public Object get(int index) {
		if (index < 0) throw new RuntimeException("index out of linkedlink range (<0)");
		int i = index;
		Link tmp = first;
		
		while(i > 0) {
			if (tmp == null) throw new RuntimeException("index out of linkedlink range (too big by more than 1)");
			tmp = tmp.getNext();
			i--;
		}

		if (tmp == null) throw new RuntimeException("index out of linkedlink range (too big by 1)");

		return tmp.getValue();
	}
	
	@Override
	public String toString() {
		Link tmp = first;
		
		StringBuilder str = new StringBuilder();
		str.append("LinkedLink [");
		
		while(tmp.getNext() != null) {
			str.append(tmp.getValue());
			str.append(", ");
			tmp = tmp.getNext();
		}
		
		if (tmp != null) str.append(tmp.getValue());
		str.append("]");
		
		return 	str.toString();
	}	
	
	
	public boolean contains(Object o) {
		Link tmp = first;
		
		while(tmp.getNext() != null) {
			if (tmp.getValue() == o) return true;
			tmp = tmp.getNext();
		}
		
		if (tmp != null && tmp.getValue() == o) return true;
		
		return 	false;
	}	
}

// 2.2
// si l'index est invalide, on renvoie une runtimeexception
