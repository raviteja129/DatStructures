package OLD.DS.BinarySearchTree;

class Node {
    int data;
    Node right;
    Node left;

    public Node (int data) {
        this.data = data;
    }
}

public class BinarySearchAlgo {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }
        else if(data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
    }

    public void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        else if(data < root.data) {
            root.left = delete(root.left, data);
        }
        else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            root.data = minVal(root.right);
            root.right = delete(root.right, data);
        }
        return root;
    }

    public int minVal(Node root) {
        int val = root.data;
        while (root.left != null) {
            val = root.left.data;
            root = root.left;
        }
        return val;
    }

}
