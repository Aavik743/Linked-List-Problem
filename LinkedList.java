package linky;

public class LinkedList {
	MyNode head = null;

	public void  addNode(Object o) {
		
		MyNode<Object>	myFirstNode = new MyNode<>(o);
		
		if(head==null) {
			head = myFirstNode;
		}
		
		else {
			myFirstNode.setNext(head);
			head = myFirstNode;
		}


	}
	
	public void toPrint() {

		MyNode first = head;
		
		if(first == null) {
			return;
		}
		
		while(first.getNext() != null ) {
			System.out.print(first.getKey()+" ");
			first = first.getNext();
		}
		System.out.print(first.getKey()+" ");

	}
	
	public void  toAppend(Object o) {
		MyNode<Object>	myFirstNode = new MyNode<>(o);
		if(head==null) {
			head = myFirstNode;
		}else {

			MyNode last= getLastNode();
			last.setNext(myFirstNode);
		}

	}
	
	public MyNode getLastNode() {

		MyNode first = head; 
		while(first.getNext() != null ) {

			first = first.getNext();

		}
		return first;

	}

}
