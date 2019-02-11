// $ javac PrintArgs.java && java PrintArgs voici des arguments
// Voici
// des
// arguments


// 1
// public class PrintArgs {
// 	public static void main(String[] args) {
// 			System.out.println(args[0]);
// 	}
// }
// si pas d'argument avant de faire la boucle : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

// 2
// public class PrintArgs {
// 	public static void main(String[] args) {
// 		for (int i=0; i<args.length; i++) {
// 			System.out.println(args[i]);
// 		}
// 	}
// }

// 3 
public class PrintArgs {
	public static void main(String[] args) {
		for (String arg: args) {
			System.out.println(arg);
		}
	}
}
