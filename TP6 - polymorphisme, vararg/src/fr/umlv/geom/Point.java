package fr.umlv.geom;

public class Point {
	// MEMBERS
	private /*final*/ int x;
	private /*final*/ int y;

	// CONSTRUCTORS
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	// GETTERS
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	// METHODS
	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
	
	// distance squared
	public float sqDistTo(Point p) {
		float dx = x - p.x;
		float dy = y - p.y;
		return dx*dx + dy*dy;
	}
	
	//distance
	public float distTo(Point p) {
		return (float)Math.sqrt(this.sqDistTo(p));
	}
	
	// ne compilait pas à cause des keyword final
	// la classe est non mutable : on ne peut pas 
	// modifier ses membres
}
