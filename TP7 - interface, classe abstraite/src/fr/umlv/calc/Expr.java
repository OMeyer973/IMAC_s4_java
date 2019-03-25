package fr.umlv.calc;

import java.util.Scanner;

public interface Expr {

	public int eval();
	
	@Override
	public String toString();
	
	public static Expr parse(Scanner scanner)  throws RuntimeException {
		if (!scanner.hasNext()) throw new RuntimeException("invalid arithmetic expression input");

		String s = scanner.next();
		switch (s) {
		case "+":
			return new Add(parse(scanner), parse(scanner));
		case "-":
			return new Sub(parse(scanner), parse(scanner));
		default:
			return new Value(Integer.parseInt(s));
		}
	}
	
}
