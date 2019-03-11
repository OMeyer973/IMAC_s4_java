package fr.umlv.geom;

public class Main {

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
	}
}
