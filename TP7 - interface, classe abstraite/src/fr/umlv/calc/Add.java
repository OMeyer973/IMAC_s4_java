package fr.umlv.calc;

final class Add extends Operation {

	public Add(Expr left, Expr right) {
		super(left, right);
	}
	
	public int eval() {
		return getLeft().eval() + getRight().eval();
	}

	public String getSymbol() {
		return "+";
	}
}
