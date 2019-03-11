package fr.umlv.fight;

public class Main {

	public static void main(String[] args) {
		var a = new Robot("a");
		System.out.println(a);
		var b = new Robot("b");
		System.out.println(b);

		System.out.println("and the winner is " + Arena.fight(a, b));
		
		var andre = new Fighter("andre");
		System.out.println(andre);
		var bob = new Fighter("bob");
		System.out.println(bob);
		
		System.out.println("and the winner is " + Arena.fight(andre, bob));
	}
	
	//2.9
	// sous typage : quand on hérite d'une classe pour 
	// en faire une définition plus précise
	
	// polymorphisme : quand on redéfini une méthode pour qu'elle ait 
	// un comportement différent dans les sous-types
}
