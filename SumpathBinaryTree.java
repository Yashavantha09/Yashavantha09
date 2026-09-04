package Day9IOT;
public class SumpathBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    static void pathSum(Node root, int sum) {
        if (root == null)
            return;
        sum = sum + root.data;
        if (root.left == null && root.right == null) {
            System.out.println("Path Sum: " + sum);
            return;
        }
        pathSum(root.left, sum);
        pathSum(root.right, sum);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        pathSum(root, 0);
    }
}