package LinkedList;

public class ReverseLinkedListIII {

	class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node reverseList(Node head, int m, int n){
        if (head == null) {
            return null;
        }

        Node cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        Node con = prev, tail = cur;
        Node third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
    
    Node creatElemnts() {
    	Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        return head;
    }
    
    public static void main(String[] args) {
    	ReverseLinkedListIII m = new ReverseLinkedListIII();
        Node head = m.creatElemnts();
        
        System.out.println("Before: " + head.data  + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
        
        m.reverseList(head, 2, 3);
        System.out.println("After: " + head.data  + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
    }


}
