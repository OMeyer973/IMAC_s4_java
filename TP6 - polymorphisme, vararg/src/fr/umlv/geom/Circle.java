package fr.umlv.geom;

public class Circle {

	//MEMBERS
	private Point center;
	private int radius;
	
	//CONSTRUCTOR
	public Circle(Point c, int r) {
		this.center = new Point(c);
		this.radius = r;
	}

	//GETTERS - SETTERS
	public Point getCenter() {
		return new Point(center);
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//METHODS
	@Override
	public String toString() {
		return "cercle (" + center + ',' + radius + ')'
				+ " surface : " + surface();
	}	
	
	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}
	
	public float surface() {
		return (float)Math.PI * (float)radius*(float)radius;
	}
	
	public boolean contains(Point p) {
		return false;
	}
	
		
	//1.1
	// on précise les champs privés

	//1.6 la méthode getcenter doit retourner 
	// une copie du point
	// note : on a codé un constructeur par copie 
	//dans la classe point
	
	//1.7 
	// là getcenter renvoie une référence vers le point, 
	// donc ce code
	/*
	var point = new Point(1, 2);
    var circle = new Circle(p, 1);
    c.getCenter().translate(1,1);
    System.out.println(p);
	*/
	// translate le point p. 
	//solution : renvoyer une copie du point par la méthode get
}
