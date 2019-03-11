package fr.umlv.fight;

public class Arena {
	
	public static Robot fight(Robot r1, Robot r2) {
		
		boolean r1Turn = true; 
		while (!r1.isDead() && !r2.isDead()) {
			if (r1Turn) {
				try {
					r1.fire(r2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			else { 
				try {
					r2.fire(r1);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			r1Turn = !r1Turn;
		}
		if (!r1.isDead())
			return r1;
		return r2;
	}
	
	
}
