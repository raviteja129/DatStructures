package OLD.DS.BinarySearchTree;

/*
    For BST, from the root node the smaller values should be inserted through the left node and larger values on the right node
    Traversing BST can be done in 3 ways:
        1) Inorder
        2) Preorder
        3) Postorder
 */

public class BSRunner {
    public static void main(String[] args) {
        BinarySearchAlgo bs = new BinarySearchAlgo();

        bs.insert(50);
        bs.insert(30);
        bs.insert(20);
        bs.insert(40);
        bs.insert(70);
        bs.insert(60);
        bs.insert(80);

        System.out.println("-- INORDER --");
        bs.inorder();
        System.out.println();

        System.out.println("-- PREORDER --");
        bs.preorder();
        System.out.println();

        System.out.println("-- POSTORDER --");
        bs.postorder();
        System.out.println();

        System.out.println("-- DELETE NODE --");
        bs.delete(bs.root, 40);
        System.out.println();

        System.out.println("-- INORDER AFTER DELETION --");
        bs.inorder();
        System.out.println();
    }
}
