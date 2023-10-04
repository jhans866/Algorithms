 class Node {
    public int data;
    public Node next;

    public Node(int d) {
        data = d;
    }
}
public  class SearchLinkedList {
     Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*SearchLinkedList sl= new SearchLinkedList();
        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(6);
        Node fourthNode = new Node(1);

        sl.head = firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=firstNode;
        sl.displayContents();*/

        SearchLinkedList linkedList = new SearchLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
    }
}
