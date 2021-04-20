package inheritance1;


/**
 * Square IS-A Rectangle, but LSP is violated.
 *
 */
public class Square extends Rectangle {
	
	public Square(int side) {
		super(side, side);
	}
	
}
