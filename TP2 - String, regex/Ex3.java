 import java.util.regex.*;

// javac Ex3.java && java Ex3 allez 1 les 123premier lol8 78 bjr 304958 bar abc ab3 4de f6h lollol789 184.225.207.32lolllo lollol789 184.225.207.32lolllolollol789 184.225.207.32lolllo

public class Ex3 {
	public static void main(String[] args) {
		printNumbers (args);
		printEndNumbers(args);
		printIP(args);
	}

	//1
	
	// The Java Pattern class (java.util.regex.Pattern),
	// is the main access point of the Java regular expression API.
	// Whenever you need to work with regular expressions in Java,
	// you start with Java's Pattern class. 
	
	//Pattern.compile()
	// If you need to match a text against a regular expression pattern more than one time,
	// you need to create a Pattern instance using the Pattern.compile() method.
	// Here is a Java Pattern.compile() example: 

	// basis of regex in java :
	// http://tutorials.jenkov.com/java-regex/pattern.html
	// more examples :
	// https://www.tutorialspoint.com/java/java_regular_expressions.htm

	//2
	static void printNumbers (String args[]) {
		System.out.println("q2");

        String patternString = "^[0-9]*$";
        Pattern pattern = Pattern.compile(patternString);
				
		StringBuilder out = new StringBuilder();

		for (String arg: args) {
	        Matcher matcher = pattern.matcher(arg);
        	if (matcher.matches()) {
        		out.append(arg);
        		out.append(' ');
        	}		
		}
		
		System.out.println(out);		
	}
	
	//3
	static void printEndNumbers (String args[]) {
		System.out.println("q3");

        String patternString = ".*[0-9.]+$";
        Pattern pattern = Pattern.compile(patternString);
				
		StringBuilder out = new StringBuilder();

		for (String arg: args) {
	        Matcher matcher = pattern.matcher(arg);
        	if (matcher.matches()) {
        		String a = arg.replaceAll("[^0-9]","");
        		out.append(a);
        		out.append(' ');
        	}		
		}
		
		System.out.println(out);		
	}

	//3
	static void printIP (String args[]) {
		System.out.println("q4");

        String patternString = "\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b";
        Pattern pattern = Pattern.compile(patternString);
				
		StringBuilder out = new StringBuilder();

		for (String arg: args) {
	        System.out.println(arg);
        	Matcher matcher = pattern.matcher(arg);
        		
        	if (matcher.matches()) {

				System.out.println(arg);

				// System.out.println(matcher.groupCount());
				// byte[] bytes;
				// for (byte b : bytes) {
	   			//		out.append(b & 0xFF);
	 			//  	out.append(' ');
				//     //System.out.println(b & 0xFF);
				// }
        	}
        	out . append("| ");		
		}
		
		System.out.println(out);		
	}
}
