import java.io.*;
import java.util.Stack;


public class SmallestNumberFollowingPattern {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        int num=1;
        Stack<Integer>st= new Stack<>();
        for (int i =0;i<exp.length();i++){
            char ch = exp.charAt(i);
            st.push(num);
            num++;
            if(ch=='i'){
                while(!st.isEmpty()){
                    System.out.print(st.pop()+" ");
                }
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
