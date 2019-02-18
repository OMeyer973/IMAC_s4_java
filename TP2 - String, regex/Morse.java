 

// javac Morse.java && java Morse salut les filles

public class Morse {
	public static void main(String[] args) {
		morseConcat(args);
		morseStringBuild(args);
		test(args);
	}

	//1
	static void morseConcat (String args[]) {
		System.out.println("q1");
		String out = "";	
		for (String arg: args) {
			out += arg + " Stop. ";		
		}
		System.out.println(out); 
	}

	//2
	// The java.lang.StringBuilder class is mutable sequence of characters. 
	// This provides an API compatible with StringBuffer, but with no guarantee of synchronization.
	// from https://www.tutorialspoint.com/java/lang/java_lang_stringbuilder.htm

	// StringBuilder append(String str)
	// This method appends the specified string to this character sequence.
	// StringBuilder is not the same as a string. It is a series of characters wich are mutable.

	//3
	// avantage : on ne stocke qu'un seul objet StringBuffer 
	// alors qu'avant on avait plusieurs objets sring collés 
	// les uns derrière les autres dans la variable out
	static void morseStringBuild (String args[]) {
		System.out.println("q2, q3"); 
		StringBuilder out = new StringBuilder();	
		for (String arg: args) {
			out.append(arg);
			out.append(" Stop. ");		
		}
		System.out.println(out); 
	}

	//4
	// on peut concaténer directement des caracères (' ') avec des StringBuffer 
	// note sur println : https://javapapers.com/core-java/system-out-println/
	static void test(String[] args) {
		System.out.println("q4"); 
		var first = args[0];
		var second = args[1];
		var last = args[2];
		// String out = first + ' ' + second + ' ' + last;
		System.out.println(first + ' ' + second + ' ' + last);
	}

	//5
	// bytecode avec des StringBuilder plus gros que avec des String.
	// raison inconnue.
	// jle jure, jé testé

	// si on veut garder tous les petits bouts de tring qu'on concatène pour les réutiliser plus tard
	// --> utiliser +

	// si on veut juste construire une string mais qu'on s'en fout des petits bouts 
	// --> utiliser append

	// le but de est de ne pas faire de manipulation-concaténation chelou de string (+) 
	// alors si on en fait à l'intérieur m^eme de l'appel à append ...
}
