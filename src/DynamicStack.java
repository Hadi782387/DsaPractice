public class DynamicStack {
        public static class customStack {
            int tos;
            int[] data;

            public customStack(int cap) {
                data = new int[cap];
                tos = -1;
            }

            int size() {
                return tos + 1;
            }

            void display() {
                for (int i = tos; i >= 0; i--) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
            }

            void push(int val) {
                if (tos == data.length - 1) {
                    int[] new_data=new int[2*data.length];
                    for (int i =0;i<data.length;i++){
                        new_data[i]=data[i];
                    }
                    data=new_data;
                }
                else {
                    tos++;
                    data[tos] = val;
                }
            }

            int pop() {
                if (tos == -1) {
                    System.out.println("stack underflow");
                    return -1;
                } else {
                    int val = data[tos];
                    tos--;
                    return val;
                }
            }

            int top() {
                if (tos == -1) {
                    System.out.println("stack underflow");
                    return -1;
                } else {
                    return data[tos];
                }
            }
        }

        public static void main(String[] args) {
            customStack st=new customStack(4);
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(50);
            st.push(50);
            st.display();
            System.out.println("popped:"+st.pop());
            System.out.println("top of the stack:"+st.top());
            st.display();
            System.out.println("size of stack:"+st.size());
        }
    }

