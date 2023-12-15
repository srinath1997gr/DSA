
public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree bt = new BinaryTree();
        // bt.populate(scanner);
        // bt.display();

        // BST bst = new BST();

        // int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        // bst.populate(nums);

        // int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // bst.populateSorted(nums);

        // bst.display();
        // System.out.println(bst.balanced());

        // bst.preOrder();
        // System.out.println();
        // bst.inOrder();
        // System.out.println();
        // bst.postOrder();
        // System.out.println();

        AVL tree = new AVL();

        for (int i = 0; i < 100; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());

    }
}
