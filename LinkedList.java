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
	
	public void print() {

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
}
