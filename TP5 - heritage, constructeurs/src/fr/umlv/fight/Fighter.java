package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {

	private int seed;
	Random randomno;
	
	public Fighter(String name) {
		super(name);
		Random randSeedGen = new Random();
		seed = randSeedGen .nextInt(); 

		randomno = new Random(seed);
	}
	
	public Fighter(String name, int seed) {
		super(name);
		this.seed = seed;
		randomno = new Random(seed);
	}

	//METHODS
	@Override
	protected boolean rollDice() {
		return randomno.nextBoolean();
	}
	
	@Override
    public String toString() {
    	StringBuilder out = new StringBuilder();
		out.append("Fighter " + getName());
		return new String(out);
	}
    	
	//2.1
	// un générateur pseudo aléatoire renvois un entier 
	// (ou un float, ou un boolean, peu importe en fait)
	// de manière aléatoire en apparence, mais qui est 
	// cependant reproductible. une meme seed donne toujours
	// le même résultat.

	//2.3
	// avec des getters et des setters, on peut contrôler
	// tous les accès au variables, les intercepter ou
	// faire des choses spécifiques en fonction.

	//2.5
	// olala, on va devoir recoder la méthode fire pour Fighter !
	// on aurait vraiment mieux fait d'utiliser l'héritage
	
}
