import java.util.Stack;
public class MinStack1 {
    public static class minimumStack{
        Stack<Integer>allData;
        Stack<Integer>minData;

        public minimumStack(){
            allData=new Stack<>();
            minData=new Stack<>();
        }
        int size(){
            return allData.size();
        }
        void push(int val){
            allData.push(val);
            if(minData.isEmpty() || val<=minData.peek()){
                minData.push(val);
            }
        }
        void pop(){
            if (size() == 0 ){
                System.out.println("stack  underflow:");
            }else{
                int val=allData.pop();
                if(val==minData.peek()){
                    minData.pop();
                }
            }
        }
        int top(){
            if (size() == 0 ){
                System.out.println("stack  underflow:");
                return -1;
            }else{
                return allData.peek();
            }
        }int min(){
            if (size()==0){
                System.out.println("stack  underflow:");
                return -1;
            }else{
                return minData.peek();
            }
        }
    }
    public static void main(String[] args) {
        minimumStack stack = new minimumStack();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println("Top element: " + stack.top());       // Should print 1
        System.out.println("Minimum element: " + stack.min());   // Should print 1

        stack.pop();  // Removes 1

        System.out.println("After popping:");
        System.out.println("Top element: " + stack.top());       // Should print 8
        System.out.println("Minimum element: " + stack.min());   // Should print 2
    }
}
