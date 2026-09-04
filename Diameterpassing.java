package Day9IOT;
class Node1{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
	}
}
public class Diameterpassing {
	static int diameter = 0;
	static int height(Node root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		diameter = Math.max(diameter,leftHeight+rightHeight);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		height(root);
		System.out.println("Diameter =" + diameter);

	}

}
