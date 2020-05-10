package LinkedList;
public class MiddleElement {
	class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    Node findMiddle(Node node){
        if(node == null){
            return null;
        }
        if(node.next == null){
            return node;
        }
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    Node creatElemnts() {
    	Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }
    
    public static void main(String[] args) {
        MiddleElement m = new MiddleElement();
        Node head = m.creatElemnts();
        Node middle = m.findMiddle(head);
        
        System.out.print(middle.data);
        
    }
}
