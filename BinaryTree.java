
class Node1 {
    int value;
    Node1 left;
    Node1 right;
 
    Node1(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

public class BinaryTree {
	
	Node1 root;
	
	
	public static void main(String...varArgs ) {
		
		System.out.println("Hello");
		
		Node1 tree= new Node1(1);
		
		addRecursive(tree,2);
		addRecursive(tree,3);
		
		addRecursive(tree,4);
		addRecursive(tree,5);
		
		System.out.println(tree.toString());
		
	
		
	}
	
	
	@SuppressWarnings("unused")
	private static Node1 addRecursive(Node1 current, int value) {
		
			if(current==null) {
				return new Node1(value);
			}
			
			if (value < current.value) {
		        current.left = addRecursive(current.left, value);
		    } else if (value > current.value) {
		        current.right = addRecursive(current.right, value);
		    } 
			
		    return current;
		
	}

}
