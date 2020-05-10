package LinkedList;

public class ReverseLinkedList {
	class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node reverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curNode = head;
        Node prevNode = null;
        Node nextNode = null;
        
        while(curNode != null){
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return prevNode;
    }
    
    Node creatElemnts() {
    	Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        return head;
    }
    
    public static void main(String[] args) {
    	ReverseLinkedList m = new ReverseLinkedList();
        Node head = m.creatElemnts();
        System.out.println("Before: " + head.data  + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
            
        Node rHead = m.reverseList(head);
        System.out.println("After: " + rHead.data  + " " + rHead.next.data + " " + rHead.next.next.data + " " + rHead.next.next.next.data);
    }
}
