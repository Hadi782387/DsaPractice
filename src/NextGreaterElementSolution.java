import java.io.*;
import java.util.Stack;

public class NextGreaterElementSolution {
    public static void display(int[] a){

        // stringBuilder create
        StringBuilder sb = new StringBuilder();
        // for each loop  for final output
        for (int val:a){
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {

        // advance input buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // convert string into Integer
            int n = Integer.parseInt(br.readLine());

            // creating n size of array
           int [] a = new int[n];

           // input elements of array
           for (int i =0;i<a.length;i++){
               a[i]=Integer.parseInt(br.readLine());
           }
           // method calling and displaying final answer
           int[] nge = solve(a);
           display(nge);
    }

    private static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer>st=new Stack<>();

        //push last element of array in stack
        st.push(arr[arr.length-1]);

        // traversal loop
        for (int i = arr.length-2;i>=0;i--){
            //- a +

            // while st is not empty and arr[i] is greater than equal to peek() st.pop
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }

            // if st is empty then nge[i]=-1 otherwise nge[i]=st.peek()
            if (st.isEmpty()){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }

            //push array of i
            st.push(arr[i]);
        }
        // return nge
        return nge;

    }
}
