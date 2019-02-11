import java.util.Scanner; 

// javac Calc.java && java Calc

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // variable de type Scanner
		System.out.println("entrez un entier :");
		int val1 = scanner.nextInt(); // variable de type in
		System.out.println("entrez un autre entier :");
		int val2 = scanner.nextInt(); // variable de type in
		System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
		System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
		System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
		if (val2 != 0) {
			System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));			
		} else {
			System.out.println(val1 + " / " + val2 + " = vous avez tout cassé");
		}
	}
}

// 3
// nextInt() n'est pas une fonction
// on ne peut pas appeler simplement "nextInt()" 
// il faut l'appeler depuis un objet Scanner

// 4
// c'est une méthode de l'objet Scanner

// 5
// pour utiliser la class Scanner 
// il faut importer le fichier qui la décrit


