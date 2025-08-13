package LinkListPractice;
import java.util.Scanner;
public class LinkedList1st {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkList {
        Node head, tail;
        int size;

        public void add(int val) {
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

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty nothing to remove:");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty:");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("list is empty:");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("list is empty:");
                return -1;
            } else if (idx <= 0 || idx >= size) {
                System.out.println("invalid index:");
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
            return 0;
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        public void addLast(int val) {
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

            LinkList linklist = new LinkList();
            boolean is_Running = true;
            Scanner sc = new Scanner(System.in);

            while (is_Running) {
                System.out.println("\n___________ Menu ___________");
                System.out.println("1. add");
                System.out.println("2. addFirst");
                System.out.println("3. addLast");
                System.out.println("4. size");
                System.out.println("5. removeFirst");
                System.out.println("6. getFirst");
                System.out.println("7. getLast");
                System.out.println("8. getAt");
                System.out.println("9. display");
                System.out.println("10. quit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value to add: ");
                        int val = sc.nextInt();
                        linklist.add(val);
                        break;

                    case 2:
                        System.out.print("Enter value to add at first: ");
                        linklist.addFirst(sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Enter value to add at last: ");
                        linklist.addLast(sc.nextInt());
                        break;

                    case 4:
                        System.out.println("Size: " + linklist.size());
                        break;

                    case 5:
                        linklist.removeFirst();
                        break;

                    case 6:
                        System.out.println("First element: " + linklist.getFirst());
                        break;

                    case 7:
                        System.out.println("Last element: " + linklist.getLast());
                        break;

                    case 8:
                        System.out.print("Enter index: ");
                        System.out.println("Element at index: " + linklist.getAt(sc.nextInt()));
                        break;

                    case 9:
                        linklist.display();
                        break;

                    case 10:
                        is_Running = false;
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");

                }
            }


            sc.close();
    }
}
