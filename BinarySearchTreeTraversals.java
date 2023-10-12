public class BinarySearchTreeTraversals {
    static class Node{
        int data;
        Node left, right;
        Node (int d)
        {
            data = d;
            left = right = null;
        }
    }
    static void printInorder(Node node)
    {
        if (node==null)
        {
            return;
        }
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);

    }
    static void printPreorder(Node node)
    {
        if (node==null)
        {
            return;
        }
        System.out.println(node.data);
        printPreorder(node.left);
        printPreorder(node.right);

    }
    static void printPostorder(Node node)
    {
        if (node==null)
        {
            return;
        }
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        //contruct below tree

                 /* 100
                /      \
             20         200
            /   \      /   \
          10    30    150   300*/

        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);
        System.out.println("Inorder Traversal: ");
        printInorder(root);
        System.out.println("Preorder Traversal: ");
        printPreorder(root);
        System.out.println("postorder Traversal: ");
        printPostorder(root);
    }
}
