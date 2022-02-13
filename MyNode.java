package linky;

public class MyNode<K> {
	private  K key;
    // K is generic it can store anything .
	private MyNode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;


	}


	public K getKey() {
		return this.key;
	}


	public MyNode getNext() {

		return next;
	}


	public void setNext(MyNode next) {

		this.next = next;
	}


}
