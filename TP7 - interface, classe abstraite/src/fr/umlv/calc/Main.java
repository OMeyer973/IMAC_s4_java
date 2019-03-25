package fr.umlv.calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		OpOrValue expression = new OpOrValue(
				OpOrValue.OP_ADD, 
				new OpOrValue(2), 
				new OpOrValue(3)
		);
		System.out.println(expression.eval());

		System.out.print("Enter your calculus: ");
		OpOrValue calculus = OpOrValue.parse(sc);

		System.out.println(calculus);
		System.out.println(calculus.eval());
		*/
		Expr exp = new Add(new Value(1), new Value(2));
		System.out.println(exp);
		System.out.println(exp.eval());

		System.out.print("Enter your calculus: ");
		Expr exp2 = Expr.parse(sc);
		System.out.println(exp2);
		System.out.println(exp2.eval());

				
	}

	// 1.1
	// le constructeur à 4 argument est privé car cette classe représente
	// soit des valeurs soit des opérations.
	// on ne peut pas déclarer un objet qui est les 2 en même temps

	// 1.2
	// on check pas l'opérateur et les non null

	// 2.4
	// on n'a pas besoin d'hériter d'attributs dans expression, 
	// on préfère utiliser une interface
	
	// 2.5
	// on fait une classe abstraite qui définit une opération générique
	// Add et Sub en héritent et implémentent la méthode eval 
	// et la méthode getsymbol que l'on a définie pour faciliter toString();
	
	// les méthodes sont publiques
	
}
