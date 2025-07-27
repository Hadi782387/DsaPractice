package QueueDsaPractice;

public class DynamicQueue {
    public static class customDynamicQueue {
        int[] data;
        int front;
        int size;

        public customDynamicQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            return size;
        }

        void display() {
            if (size == 0) {
                System.out.println("queue overflow");
            }
            for (int i = 0; i < data.length; i++) {
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        void add(int val) {
            if (size == data.length) {
              int[] newData=new int[2*data.length];
              for (int i=0;i<size;i++){
                  int idx=(front+1)%data.length;
                  newData[i]=data[idx];
              }
              data=newData;
              front=0;
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        void remove() {
            if (size == 0) {
                System.out.println("Queue underflow");
            } else {
                int val = data[front];
                front = (front + 1) % data.length;
                size--;
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return data[front];
            }
        }
    }

    public static void main(String[] args) {
        customDynamicQueue queue=new customDynamicQueue(4);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(30);
        queue.display();

        queue.remove();
        queue.display();

        System.out.println(queue.size());
        System.out.println(queue.peek());

    }
}
