public class NormalStack {
    public static class CustomStack {
        int[] data;
        int tos;

        // Constructor to initialize the stack with given capacity
        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        // Returns the number of elements in the stack
        int size() {
            return tos + 1;
        }

        // Displays all elements from top to bottom
        void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.println(data[i] + " ");
            }
            System.out.println();
        }

        // Pushes a value onto the stack
        void push(int val) {
            if (tos == data.length - 1) {
                System.out.println("Stack overflow");
            } else {
                tos++;
                data[tos] = val;
            }
        }

        // Pops the top value from the stack
        int pop() {
            if (tos == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = data[tos];
                tos--;
                return val;
            }
        }

        // Returns the top value without removing it
        int top() {
            if (tos == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return data[tos];
            }
        }
    }

    // Main method to test the CustomStack class
    public static void main(String[] args) {
        CustomStack st = new CustomStack(5);  // Create stack of capacity 5

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.display();                         // Should print: 30 20 10

        System.out.println("Top: " + st.top());   // Should print: Top: 30

        System.out.println("Popped: " + st.pop()); // Should print: Popped: 30

        st.display();                         // Should print: 20 10

        System.out.print("Size: " + st.size()); // Should print: Size:2
    }
}
