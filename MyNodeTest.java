package linky;

public class MyNodeTest {

	public static void linky(){

		MyNode l1 = new MyNode(56);
		MyNode l2 = new MyNode(30);
		MyNode l3 = new MyNode(70);

		l1.setNext(l2);
		l2.setNext(l3);

		MyNode first=l1;
		while(first.getNext() != null ) {
			System.out.print(first.getKey() +" ");
			first=first.getNext();
		}
		System.out.print(first.getKey()+" ");
	}
	
	public static void main(String[] args) {
		linky();

	}
}
