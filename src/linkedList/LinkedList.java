package linkedList;

public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    Node head; // Points to the first node in the list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        head = null;
    }

    // Method to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Method to insert a node at a specific position in the list
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position is greater than the length of the list.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static Node reverseLinkedList(Node currentNode) {
        // Base case: If the current node is null or the list is empty, return null.
        if (currentNode == null || currentNode.next == null) {
            return currentNode;
        }

        // Recursively reverse the rest of the list.
        Node restOfList = reverseLinkedList(currentNode.next);

        // Reverse the links between the current node and the next node.
        currentNode.next.next = currentNode;
        currentNode.next = null;

        // Return the new head of the reversed list.
        return restOfList;
    }




    public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            linkedList.insertAtBeginning(1);
            linkedList.insertAtEnd(3);
            linkedList.insertAtPosition(2, 1);
            linkedList.insertAtBeginning(0);

            linkedList.display();
        linkedList.head=reverseLinkedList(linkedList.head);

;                  linkedList.display();

        }

}



