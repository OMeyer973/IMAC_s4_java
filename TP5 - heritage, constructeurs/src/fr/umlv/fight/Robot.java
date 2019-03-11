package fr.umlv.fight;

public class Robot {

	// MEMBERS
		private String name;	
		private int hp;
		
		private static int dmg = 2;

		//CONSTRUCTORS
		public Robot(String name) {
			this.name = name; 
			this.hp = 10;
		}
		
		//GETTERS - SETTERS
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
		
		public int getHp() { return hp; }
		public void setHp(int hp) { this.hp = hp; }
		
		public static int getDmg() { return dmg; }

			

		//PRIVATE METHODS
		protected boolean rollDice() {
			return true;
		}

		private void wound (int damage) {
			hp = Math.max(hp - damage, 0);
		}

		//PUBLIC METHODS
		public void fire(Robot target) throws Exception {
			if (target.isDead())
				throw new Exception(this + "a essayé de tirer sur un mort !");
			
			if (rollDice()) {
				target.wound(dmg);
				System.out.println(this + " a tiré et touché " + target + "(-" + dmg + " pv)");
				System.out.println(target + " : " + target.hp + "pv restants");				
			} else {
				System.out.println(this + " a tiré et manqué " + target);
			}
		}

	    
		public boolean isDead() {
			return hp <= 0;
		}
		
		@Override
	    public String toString() {
	    	StringBuilder out = new StringBuilder();
			out.append("Robot " + name);
			return new String(out);
		}
	    	
}
