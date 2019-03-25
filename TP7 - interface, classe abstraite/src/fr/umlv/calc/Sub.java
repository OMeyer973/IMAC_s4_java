package fr.umlv.calc;

final class Sub extends Operation {

	public Sub(Expr left, Expr right) {
		super(left, right);
	}
	
	public int eval() {
		return getLeft().eval() - getRight().eval();
	}

	public String getSymbol() {
		return "-";
	}
}
