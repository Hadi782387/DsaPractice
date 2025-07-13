import java.io.*;
import java.util.Stack;

public class SpanOfStack {
    public static void display(int [] a){
        // Create string builder start for reach loop append val and \n print sb int the end
        StringBuilder sb = new StringBuilder();
        for (int val:a){
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        // input of n and array of n by BufferedReader
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         int [] a = new int[n];
         for (int i =0;i<a.length;i++){
             a[i]=Integer.parseInt(br.readLine());
         }
         // store function in span and display span
        int[]span=solve(a);
         display(span);

    }

    private static int[] solve(int[] arr) {
        // value of span is arr.length
        int[]span=new int[arr.length];

        // create stack
        Stack<Integer>st=new Stack<>();
        // push 0
        st.push(0);
        // set span of 0 is 1
        span[0]=1;

        // loop 1 to arr.length
        for (int i =1;i<arr.length;i++) {
            // while st is not empty array of i greater than array of st.peek: st.pop
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            // if stack is empty set span[i]=1 otherwise span[i]=i-st.peek push i after loop return span
            if (st.isEmpty()) {
                span[i] =i+1;
            }else{
                span[i]=i-st.peek();
            }

            st.push(i);
        }
        return span;
    }
}
