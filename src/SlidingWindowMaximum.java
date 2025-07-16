import java.io.*;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) throws IOException {

        // manages input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr=new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine().trim());

        // process to find NGE
        Stack<Integer>st=new Stack<>();
        int[] nge = new int[arr.length];
        st.push(arr.length-1);
        nge[arr.length-1]= arr.length;


        // traversal loop to find nge
        for (int i= arr.length-2;i>=0;i--){
            // pop until stack is empty and all big elements popped
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            // nge[i] = arr.length if stack is empty else nge[i]=st.peek()
            if (st.isEmpty()){
                nge[i]=arr.length;
            }else{
                nge[i]=st.peek();
            }
            //in the end push i
            st.push(i);
        }
        // initialize j=0 loop 0 to arr.length-k
        int j=0;
        for (int i=0;i<=arr.length-k;i++){

            // if h is smaller than i j=i
            if(j>i){
                j=i;
            }
            // j = nge[j] until nge[j]>i+k
            while(nge[j] < (i + k)){
                j=nge[j];
            }
            System.out.println(arr[j]);
        }
    }
}
