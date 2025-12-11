public class TestBST {
    public static void main(String[] args) {
        // Create a BST
        BST<String> tree = new BST<>();
        tree.insert("Green");
        tree.insert("Mabel");
        tree.insert("Teal");
        tree.insert("Blue");
        tree.insert("Jade");
        tree.insert("Purple"); // Insert Purple to the tree
        tree.insert("Danube");

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.print("\nIs Purple in the tree? " +
                tree.search("Purple"));

        // Get a path from the root to Purple
        System.out.print("\nA path from the root to Purple is: ");
        java.util.ArrayList<BST.TreeNode<String>> path
                = tree.path("Purple");
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
        System.out.println();
        //print to get the height of the tree
        System.out.println("The height of the tree is " + tree.height());
        //print to count the number of leaves in a BST
        System.out.println("The number of leaves are " + tree.countLeaves());
        //Checking to see what is the minimum and maximum values of the BST
        System.out.println(" The minimum is " + intTree.min());// gets the minimum of which is 1
        System.out.println(" The maximum is " + intTree.max());//gets the maximum which is 8

        // Printing out intTree into an Array List with Inorder traversal
        System.out.println(intTree.toSortedList());

        //Testing to see if the BST is balanced or unbalanced
        System.out.println("The tree is balanced? " + intTree.isBalanced());
        //Now testing to see if the opposite result works to make sure there is no flaws
        Integer[] n2 = {20,10,40,30};
        BST<Integer> testing = new BST<>(n2);
        System.out.println("The tree is balanced? " + testing.isBalanced());


    }
}