
public class DeleteKthNodeFromEndLinkedList {
    Node head;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteKthNodeFromEnd(int k) {

        if (head == null || k == 0) {
            return;
        }

        // list = [a, b, c, d]; k = 2
        Node first = head; // a
        Node second = head; // a

        for (int i = 0; i < k; i++) {
            System.out.println("value of i: "+i);
            System.out.println("value of k: "+k);
            second = second.next;
            if (second.next == null) {
                // K >= length of list
                System.out.println("second.next: "+second.next);
                if (i == k - 1) {
                    System.out.println("value of k in if: "+k);
                    System.out.println("value of i in if: "+i);
                    head = head.next;
                    System.out.println("value of head in if: "+head.data);
                }
                return;
            }
        }

        // second = c

        while (second.next != null) {
            System.out.println("second.next inside while line 43: "+second.data);
            first = first.next;
            System.out.println("first.next inside while line 45: "+second.data);
            second = second.next;
            System.out.println("second inside while line 47: "+second.data);
        }

        // first = b
        // second = d

        first.next = first.next.next;
        System.out.println("first.next inside while line 53: "+second.next);

    }
    public static void main(String[] args) {
        DeleteKthNodeFromEndLinkedList linkedList = new DeleteKthNodeFromEndLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        linkedList.deleteKthNodeFromEnd(2);
        linkedList.displayContents();
    }
}
