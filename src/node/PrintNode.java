package node;

public class PrintNode extends AbstractNode{

	private static final long serialVersionUID = 1L;
	
 	private final AbstractNode expression;
	
	public PrintNode(AbstractNode expression){
		this.expression = expression;
	}
	
	@Override
	public String toString(int indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(toString(indent, "Print\n"));
		indent++;
        if (expression != null)
        	sb.append(expression.toString(indent));
		return sb.toString();
	}

}
