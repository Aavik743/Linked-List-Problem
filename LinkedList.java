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
	
	public void insertBetween(Object o1, Object o2, Object o3) {

		MyNode first = head;
		int count=0;
		while(first.getNext() != null ) {

			if(first.getKey() == o1) {
				MyNode second= first.getNext();
				if(second.getKey() == o2) {
					MyNode<Object>	myFirstNode = new MyNode<>(o3);
					first.setNext(myFirstNode);
					myFirstNode.setNext(second);
					System.out.println("\nObject inserted");
					return;

				}
			}

			first = first.getNext();

		}
		System.out.println("entered elements not found : hence filed .");	

	}

}
