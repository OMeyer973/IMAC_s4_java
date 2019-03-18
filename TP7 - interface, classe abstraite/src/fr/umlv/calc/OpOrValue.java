package fr.umlv.calc;


public class OpOrValue {
  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;
  
  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;
  
  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }
  
  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }
  
  public OpOrValue(int operator, OpOrValue left, OpOrValue right) throws RuntimeException {
    this(operator, 0, left, right); 
    if (!(operator == OP_NONE || operator == OP_ADD || operator == OP_SUB))
    	throw new RuntimeException("given operator is undefined in OpOrValue constructor");
  }
  
  public int eval() {
    switch(operator) {
    case OP_ADD:
      return left.eval() + right.eval();
    case OP_SUB:
      return left.eval() - right.eval();
    default: // case OP_NONE:
      return value;
    }
  }	
}
