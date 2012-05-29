package node;

public class ReadNode extends AbstractNode {

	private static final long serialVersionUID = 1L;
    
	private final StringNode stringNode;

    public ReadNode() {
        this(null);
    }

    public ReadNode(StringNode stringNode) {
        this.stringNode = stringNode;
    }
    
    @Override
    public String toString(int indent) {
        return toString(indent, "Read(" + stringNode.toString(0) +")\n");
    }
}