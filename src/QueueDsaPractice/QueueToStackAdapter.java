package QueueDsaPractice;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter {
    public static class queue_to_stack_adapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public queue_to_stack_adapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }
        int size(){
            return mainQ.size();
        }

        void push(int val){
            while(!mainQ.isEmpty()) helperQ.add(mainQ.remove());
            mainQ.add(val);
            while(!helperQ.isEmpty()) mainQ.add(helperQ.remove());
        }

        int pop(){
            if (size()==0){
                System.out.println("Stack Underflow");
                return 1;
            }else{
                return mainQ.remove();
            }

        }
        int top(){
            if (size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }else{
                return mainQ.peek();
            }
        }
    }

        public static void main(String[] args) {
            QueueToStackAdapter.queue_to_stack_adapter stack = new QueueToStackAdapter.queue_to_stack_adapter();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.top()); // Should print 30
            System.out.println("Pop element: " + stack.pop()); // Should remove 30
            System.out.println("Top element: " + stack.top()); // Should now print 20
            System.out.println("Size of stack: " + stack.size()); // Should be 2
        }

    }
