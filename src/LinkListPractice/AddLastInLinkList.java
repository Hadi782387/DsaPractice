package LinkListPractice;

public class AddLastInLinkList {

    public static class Node {
        int data;
        Node next;
    }

    public static class linkList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        // Traversing and printing the linked list
        Node current = ll.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println("\nSize of list: " + ll.size);
    }
}