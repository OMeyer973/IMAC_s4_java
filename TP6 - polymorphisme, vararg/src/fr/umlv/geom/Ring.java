package fr.umlv.geom;

public class Ring extends Circle {
	
	// MEMBERS
	private int ir;
	
	public Ring(Point c, int r, int ir) throws RuntimeException {
		super(c, r);
		if (ir<=r) this.ir = ir;
		else throw new RuntimeException("internal radius needs to be smaller that radius in Ring constructor");
	}
	
	@Override
	public String toString() {
		return "ring: {" + super.toString() + " internalRadius: " + ir + "}";
	}
	
	
	// renvoie vrai si un point est contenu dans un disque
	@Override
	public boolean contains(Point p) {
		Circle interior = new Circle(getCenter(), ir);
		return super.contains(p) && !(interior.contains(p));
	}
	
	
	
	
	//2.1 on fait de l'héritage quand on a une classe qui est
	// une définition plus précise d'une autre classe existante
	
	//2.2 si on done un ir < r, on lance une exception runtime pour ne pas avoir à la check à la compilations
	
	//2.2.2 
	// pas besoin de recoder cette méthode comme on redéfini contains
	
	//2.2.3
	// l'héritage c'est bien
}
