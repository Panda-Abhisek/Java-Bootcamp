public class BinarySearchTreeImpl {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {  
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (val < root.data) {
            return search(root.left, val);
        } else if (val == root.data) {
            return true;
        } else {
            return search(root.right, val);
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) return null;
        if (val < root.data) {
            root.left = delete(root.left, val);
        }
        else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // case 1 : 0 child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : 1 child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3 : 2 children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, val);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nodes = {5, 4, 3, 1, 2, 7};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }
        inorder(root); System.out.println();
        System.out.println(search(root, 1));
        delete(root, 1);
        inorder(root);
    }
}