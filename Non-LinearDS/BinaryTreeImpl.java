import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Pre-Order Sequence: ");
        preorder(root);
        System.out.println();

        System.out.print("In-Order Sequence: ");
        inorder(root);
        System.out.println();

        System.out.print("Post-Order Sequence: ");
        postorder(root);
        System.out.println();

        System.out.println("Level-Order Sequence: ");
        levelOrder(root);
        System.out.println();

        System.out.print("Height of Tree: ");
        System.out.println(height(root));
        System.out.println();

        System.out.print("Diameter of Tree: ");
        System.out.println(diameter(root));
        System.out.println();

        System.out.print("Diameter of Tree: ");
        System.out.println(diameter2(root).diam);
        System.out.println();
    }

    // Pre-Order Sequence
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // In-Order Sequence
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Post-Order Sequence
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level-Order Sequence
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    // Height of Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter of Tree - O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    // Diameter of Tree - O(n)
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null)
            return new TreeInfo(0, 0);

        TreeInfo leftTree = diameter2(root.left);
        TreeInfo rightTree = diameter2(root.right);

        int myHeight = Math.max(leftTree.ht, rightTree.ht) + 1;

        int diam1 = leftTree.ht + rightTree.ht + 1;
        int diam2 = leftTree.diam;
        int diam3 = rightTree.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }
}