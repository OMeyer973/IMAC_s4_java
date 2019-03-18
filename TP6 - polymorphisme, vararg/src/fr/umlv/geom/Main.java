package fr.umlv.geom;

public class Main {
	/*
	// EXERCICE 1
	public static void main(String[] args) {		
	    var point = new Point(1, 2);
	    var circle = new Circle(point, 1);
	
	    var circle2 = new Circle(point, 2);
	    circle2.translate(1, 1);
		
	    System.out.println(circle + " " + circle2);
	    
	    // 1.6
	    // ce code affiche
	    // cercle ((2,3),1) cercle ((2,3),2)
	    // problème de référence

	    var point2 = new Point (1000,1000);
	    var circle3 = new Circle (new Point(999, 1000), 2);
	    System.out.println(circle + (circle.contains(point) ? " does" : " does not") + " contains " + point);
	    System.out.println(circle + (circle.contains(point2) ? " does" : " does not") + " contains " + point2);
	    
	    System.out.println("");
	    System.out.println(circle +""+ circle2 + circle3);
	    System.out.println("one of the circles " + (Circle.contains(point2, circle, circle2, circle3) ? " does" : " does not") + " contains " + point2);
	}
	*/

	public static void main(String[] args) {
		
		//2.4
		/*
	    var point = new Point(1, 2);
	    var circle = new Circle(point, 2);
	    System.out.println(circle);
	    var ring = new Ring(point, 2, 1);
	    System.out.println(ring);
	    */
		// ce code fonctionne bien, on pourrait cependant créer un 
		// constructeur de ring avec un cercle en paramètre pour 
		// éviter de dupliquer du code
		
		var point = new Point(0,0);
		var ring = new Ring(new Point(100,0),2,1);
		var ring2 = new Ring(new Point(2,0),5,1);
		System.out.println(ring2);

		System.out.println(Ring.contains(point, ring, ring2));
		System.out.println(Circle.contains(point, ring, ring2));
		
	}
}
