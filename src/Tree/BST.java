package Tree;

class Node {
	int value;
	Node left;
	Node right;
	public Node(int val){
		value = val;
		left = null;
		right = null;
	}
    boolean isBST(Node n)  { 
        return isBSTUtil(n, Integer.MIN_VALUE, Integer.MAX_VALUE); 
    } 
  
    /* Returns true if the given tree is a BST and its 
      values are >= min and <= max. */
    boolean isBSTUtil(Node node, int min, int max) 
    { 
        if (node == null) 
            return true; 
  
        if (node.value < min || node.value > max) 
            return false; 

        return (isBSTUtil(node.left, min, node.value-1) && isBSTUtil(node.right, node.value+1, max)); 
    } 
	
	boolean isBalanced(Node node) {
		if(node == null) {
			return true;
		}
		if(node.left != null && node.right != null) {
			return(isBalanced(node.left) && isBalanced(node.right));
		} else if (node.left != null && node.right == null) {
		   return false;
		} else if (node.left == null && node.right != null) {
			return false;
		} else {
			return true;
		}
	}

}

public class BST {
	public static void main(String[] args) {
		Node node = new Node(3); 
		
        node.left = new Node(2); 
        node.right = new Node(5); 
 
        node.left.left = new Node(1);
        node.left.right = new Node(4);
        
        //node.right.right = new Node(8); 
        //node.right.left = new Node(6);
        
        System.out.println(node.isBST(node));
        System.out.println(node.isBalanced(node));
	}
}

