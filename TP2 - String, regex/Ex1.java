

// javac Ex1.java && java Ex1

public class Ex1 {
	public static void main(String[] args) {
		// 1 
		System.out.println("q1");         
		var s = "toto"; 
		// s : type string: défini à la compilation
		// la class string contient la méthode length()
		System.out.println(s.length());         

		// 2
		System.out.println("q2");         
		var s1 = "toto";
		var s2 = s1;
		var s3 = new String(s1);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		// ce bout de programme affiche
		// true
		// false

		// s2 est une référence vers s1
		// s3 est une copie du contenu de s1 

		// 3
		System.out.println("q3");         
		var s4 = "toto";
		var s5 = new String(s4);

		System.out.println(s4.equals(s5));
		// == tests for reference equality (whether they are the same object).
		// .equals() tests for value equality (whether they are logically "equal").
		// note Objects.equals() checks for null before calling .equals() so you don't have to

		// 4
		System.out.println("q4, q5");      
		var s6 = "toto";
		var s7 = "toto";

		System.out.println(s6 == s7);
		// ce bout de programme affiche
		// true
		// les s6 et s7 sont des références. 
		// "toto" est l'objet sur lequel elles pointent
		// note : quand on fait des concaténations et des "modifications" de variables string
		// 		  on ne modifie pas directement les objets
		// 		  java bricole avec les références mais les objets ne sont jamais directement modifiés 
		// 		  -> une variable peut ^etre une sorte de liste de référence vers des "vrais" objets string 

		// 5
		// If strings were mutable, we could do something like this:

		// String s1 = "Hello";
		// String s2 = s1;
		// s1.setCharAt(1, 'a'); // Fictional method that sets character at a given pos in string
		// System.out.println(s2); // Prints "Hallo"

		// 6
		System.out.println("q6"); 
		var s8 = "hello";
		s8.toUpperCase();
		System.out.println(s8);
		// s8.toUpperCase() retourne s8 en upperCase (var a = s8.upperCase(); --> a == "HELLO")
		// mais ne modifie pas l'objet pointé vers s8.
		// pour le faire, on peut faire comme ça :

		// 6 bis
		System.out.println("q6 bis"); 
		var s9 = "hello";
		s9 = s9.toUpperCase();
		System.out.println(s9);
	}
}
