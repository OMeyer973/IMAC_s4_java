package fr.umlv.calc;

import java.util.Objects;

public class Value implements Expr {

	private final int value;

	public Value(int value) {
		this.value = Objects.requireNonNull(value);
	}

	public int eval() {
		return value;
	}

	@Override
	public String toString() {
		return (Integer.toString(value));
	}
}
