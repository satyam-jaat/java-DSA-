
//Question to find the linked list middle element  

class LinkedListMiddleElement {

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    public static int middle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String args[]) {
        LinkedListMiddleElement list = new LinkedListMiddleElement();
        Node head = list.new Node(1);

        head.data = 1;
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);

        Node current = head;
        while(current!=null) {
            System.out.print(current.data+"->");
           
            current = current.next;
        }
        System.out.print("NULL");

        System.out.println(middle(head));
    }
}
