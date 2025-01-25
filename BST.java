public class BST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node head) {
        Node temp = head;
        if(temp == null) {
            return;
        }
        System.out.print(temp.data+"->");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public static void inOrder(Node head) {
        Node temp = head;
        if(temp == null) {
            return;
        }
        
        preOrder(temp.left);
        System.out.print(temp.data+"->");
        preOrder(temp.right);
    }

    public static void postOrder(Node head) {
        Node temp = head;
        if(temp == null) {
            return;
        }
        
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data+"->");
    }

    public static boolean search(Node head, int element) {
        if(head == null) {
            return false;
        }
        Node temp = head;
        while(head != null) {
            if(temp.data == element) {
                return true;
            }

            if(temp.data > element) {
                temp = temp.left;
            }else {
                temp = temp.right;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        BST tree = new BST();

        Node head = tree.new Node(5);
        head.left = tree.new Node(3);
        head.right = tree.new Node(6);
        head.left.left = tree.new Node(1);
        head.left.right = tree.new Node(4);

        System.out.println("\nPreOrder of BST: ");
        preOrder(head);

        System.out.println("\nInOrder of BST: ");
        inOrder(head);

        System.out.println("\nPostOrder of BST: ");
        postOrder(head);


        int search_element = 3;
        if(search(head, search_element)) {
            System.out.println("Element is exist in the BST: ");
        }else {
            System.out.println("Element is not present in the BST: ");
        }
    }
}

