package fr.umlv.calc;

import java.util.Scanner;

public class Main {
	  
	  public static OpOrValue parse(Scanner scanner) {
		  String s = scanner.next();
		  switch (s) {
		  case ("+") : 
			  return OpOrValue(OP_ADD, parse(scanner), parse(scanner));
		  case ("-") : 
			  return OpOrValue(OP_SUB, parse(scanner), parse(scanner));
		  default :
			  return OpOrValue(Integer.parseInt(s));
		  }
	  }
	  
	  public static void main(String[] args) {
	    OpOrValue expression = new OpOrValue(OP_ADD,
	        new OpOrValue(2),
	        new OpOrValue(3)
	        );
	    System.out.println(expression.eval());
	    
	    Scanner sc = new Scanner(System.in);
	    
	  }
	  
	  //1.1
	  // le constructeur à 4 argument est privé car cette classe représente 
	  // soit des valeurs soit des opérations.
	  // on ne peut pas déclarer un objet qui est les 2 en même temps
		
	  //1.2
	  // on check pas l'opérateur

}
