package fr.umlv.geom;

public class Point {
	private /*final*/ int x;
	private /*final*/ int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
	
	public float distance(Point a, Point b) {
		return 0;
	}
	
	// ne compilait pas à cause des keyword final
	// la classe est non mutable : on ne peut pas 
	// modifier ses membres
}
