import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {

    }

    public void populate(Scanner scanner) {
        System.out.print("Enter the value of root node - ");
        this.root = new Node(scanner.nextInt());
        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
        System.out.print("Do you want to enter left of the node " + node.val + " - ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter the value left of the node " + node.val + " - ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.print("Do you want to enter right of the node " + node.val + " - ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter the value right of the node " + node.val + " - ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }

    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node n, String indent) {
        if (n == null) {
            return;
        }
        System.out.print(n.val);
        display(n.left, indent + "/t");
        display(n.right, indent + "/t");

    }

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}
