package LinkedList;

public class implimentation {
	
	class Node {
		private Node next;
		private int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public int getData() {
			return this.data;
		}
		
		public void add(int data) {
			Node newNode = new Node(data);
			this.next = newNode;	
		}
	}
	
	class LinkedList {
		private Node head;
		private Node tail;
		
		LinkedList(int data){
			head = new Node(data);
			tail = head;
		}
		
		public void addNode(Node newNode) {
			tail.next = newNode;
			tail = newNode;
		}
		
		public void addData(int data) {
			Node newNode = new Node(data);
			tail.next = newNode;
			tail = newNode;
		}
		
		public Node getHead() {
			return this.head;	
		}
		
		public Node getTail() {
			return this.head;	
		}
		
		@Override
		public String toString() {
			String toStr = "";
			Node start = head;
			while(start != null) {
				toStr = toStr + " " + start.getData();
				start = start.getNext();
			}
			return toStr;
		}
	}
	
	void creatList() {
		LinkedList ls = new LinkedList(2);
		ls.addData(3);
		ls.addData(4);
		ls.addData(5);
		ls.addData(6);
		
		System.out.println(ls.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implimentation link = new implimentation();
		link.creatList();

	}

}
