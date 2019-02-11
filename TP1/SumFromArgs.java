import java.lang.Integer;
import java.util.Arrays;

// javac SumFromArgs.java && java SumFromArgs 1 2 3 

public class SumFromArgs {
	public static void main(String[] args) {
		// System.out.println("Sum of " + args + " : " + sumInts(stringsToInts(args)));
		// prints : Sum of [Ljava.lang.String;@1c2c22f3 : 6
		System.out.println("Sum of " + Arrays.toString(args) + " : " + sumInts(stringsToInts(args)));
	}

	public static int[] stringsToInts (String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i=0; i<stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}

	public static int sumInts (int[] intArray) {
		int out = 0;
		for (int i: intArray) {
			out += i;
		}
		return out;
	}

}

// 2 
// methde statique : méthode qui ne dépend pas d'un objet particulier

// 3
// si parseInt d'une String qui n'est pas un entier :
// Exception in thread "main" java.lang.NumberFormatException: For input string: "f"
