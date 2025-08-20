package LinkListPractice;

import java.util.LinkedList;

public class StackAdapterLinkedList {
    public static class LinkedListStackAdapter {
        LinkedList<Integer> list;

        public LinkedListStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
            System.out.println("Pushed: " + val);
        }

        void pop() {
            if (size() == 0) {
                System.out.println("Stack is empty");
            } else {
                int removed = list.removeFirst();
                System.out.println("Popped: " + removed);
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return list.getFirst();
            }
        }

        void display() {
            if (size() == 0) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack (top to bottom): ");
                for (int val : list) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        LinkedListStackAdapter adapter = new LinkedListStackAdapter();

        System.out.println("🔹 Pushing elements onto the stack:");
        adapter.push(10);
        adapter.push(20);
        adapter.push(30);
        adapter.push(40);

        System.out.println("\n🔹 Current stack:");
        adapter.display();

        System.out.println("\n🔹 Top element: " + adapter.top());
        System.out.println("🔹 Stack size: " + adapter.size());

        System.out.println("\n🔹 Performing pop operation:");
        adapter.pop();

        System.out.println("\n🔹 Stack after pop:");
        adapter.display();
    }
}