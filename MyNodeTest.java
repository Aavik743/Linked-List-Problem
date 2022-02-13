package linky;

public class MyNodeTest {

	public static void addNode() {

		LinkedList link = new LinkedList();
		
		link.toAppend(56);
		link.toAppend(30);
		link.toAppend(70);
		
		link.toPrint();
		
		link.insertBetween(30, 70, 40);
		
		link.toPrint();
		
	}

	public static void main(String[] args) {

		addNode();

	}

}
