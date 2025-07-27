package QueueDsaPractice;
public class QueueInJava {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        // Constructor
        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        // Returns size of the queue
        int size() {
            return size;
        }

        // Displays the queue elements
        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        // Adds a value to the queue
        void add(int val) {
            if (size == data.length) {
                System.out.println("Queue Overflow");
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        // Removes and returns the front element
        void remove() {
            if (size == 0) {
                System.out.println("Queue Underflow");
            } else {
                int val = data[front];
                front = (front + 1) % data.length;
                size--;
            }
        }

        // Returns the front element without removing
        int peek() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                return data[front];
            }
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);

        q.add(10);
        q.add(20);
        q.add(40);
        q.add(40);
        q.add(50);
        q.display(); // 10 20 30 40 50

        q.remove(); // removes 10
        q.remove(); // removes 20
        q.display(); // 30 40 50

        q.add(60);
        q.add(70); // fills queue again
        q.display(); // 30 40 50 60 70

        System.out.println("Front: " + q.peek()); // 30
        System.out.println("Size: " + q.size());  // 5

        q.add(80); // should say overflow
    }
}
