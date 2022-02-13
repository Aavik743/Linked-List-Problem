package linky;

public class MyNodeTest {


	public static void addNode() {

		LinkedList link = new LinkedList();
		
		link.toAppend(56);
		link.toAppend(70);
		
		link.toPrint();
		
		link.insertBetween(56, 70, 30);
		
		link.toPrint();
		
	}

	public static void main(String[] args) {

		addNode();

	}

}
