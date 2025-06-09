import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
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
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
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
    }

    //Pre-Order Sequence
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //In-Order Sequence
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Post-Order Sequence
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //Level-Order Sequence
    public static void levelOrder (Node root) {
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

    //Height of Tree
    public static int height(Node root) {
       if(root == null) {
           return 0;
       }

       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return Math.max(leftHeight, rightHeight) + 1;
    }

    
}