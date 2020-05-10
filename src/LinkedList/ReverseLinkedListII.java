package LinkedList;

public class ReverseLinkedListII {
	boolean stop = false;
	Node left;
	class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void reverseList(Node right, int m, int n){
        if(n == 1){
            return;
        }
        
        if(m > 1) {
        	left = left.next;
        }
   
        right = right.next;
        
        reverseList(right, m - 1, n - 1);
        
        if(left == right || right.next == left) {
        	stop = true;
        }
        
        if(!stop) {
        	int temp = left.data;
        	left.data = right.data;
        	right.data = temp;
        	left = left.next;
        }
    }
    
    Node creatElemnts() {
    	Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        left = head;
        return head;
    }
    
    public static void main(String[] args) {
    	ReverseLinkedListII m = new ReverseLinkedListII();
        Node head = m.creatElemnts();
        
      
        System.out.println("Before: " + head.data  + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
        
        m.reverseList(head, 2, 3);
        System.out.println("After: " + head.data  + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
    }

}
