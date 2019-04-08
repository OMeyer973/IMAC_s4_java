
import java.util.ArrayList;

public class Basket {
	private final ArrayList<Fruit> fruits;
	public Basket() {
		this.fruits = new ArrayList<Fruit>();
	}
	
	 // Add a fruit to the basket
	public void add(Fruit f) {
		this.fruits.add(f);
	}
	
	// Add fruits to the basket
	public void add(Fruit f, int n) {
		assert n > 1 : "Can't add negative or null amount of fruits";
		f.setQuantity(n);
		this.fruits.add(f);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		int total = 0;
		str.append("-----------------\n");
		str.append("basket contains :\n");
		for(Fruit fruit : fruits) {
			str.append("|");
			str.append(fruit.toString());
			str.append(" x ");
			str.append(fruit.getQuantity());
			str.append("\n");
			total += fruit.price() * fruit.getQuantity();
		}
		str.append("price : " + total);
		str.append("-----------------\n");
		return str.toString();
	}
	
}


/*
6

La classe fruitquantity ne sert que dans le remplissage du
panier, on n'en a pas besoin à l'extérieur.

j'ai préféré utiliser l'héritage
entre la classe fruit et apple et pear
plutot que d'utiliser la classe fruitquantity 


*/