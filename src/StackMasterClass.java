import java.io.*;
import java.util.Stack;
public class StackMasterClass {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val:a){
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        int[] nge = operation(a);
       display(nge);
    }
    private static int[] operation(int[] arr){
        Stack<Integer>st=new Stack<>();
        st.push(arr[arr.length-1]);
        int[] nge = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                nge[i]=1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}

































//import java.io.*;
//import java.util.Stack;
//public class StackMasterClass {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < exp.length(); i++) {
//            char ch = exp.charAt(i);
//            if (ch=='(' || ch=='[' || ch=='{'){
//                st.push(ch);
//            }
//            else if(ch==')'){
//                boolean val = CheckBrackets(st,'(');
//                if(!val){
//                    System.out.println(val);
//                    return;
//                }
//            }
//            else if(ch==']'){
//                boolean val = CheckBrackets(st,'[');
//                if(!val){
//                    System.out.println(val);
//                    return;
//                }
//            }else if (ch=='}'){
//                boolean val = CheckBrackets(st,'{');
//                if(!val){
//                    System.out.println(val);
//                    return;
//                }
//            }
//        }
//        System.out.println(st.isEmpty());
//    }
//    public static boolean CheckBrackets(Stack<Character>st,char correspondingCh){
//        if (st.isEmpty()) return false;
//        else if (st.peek()!=correspondingCh) return false;
//
//        else{
//            st.pop();
//            return true;
//        }
//    }
//}
//
//
////public class StackMasterClass {
////    public static void main(String[] args)throws Exception {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String exp = br.readLine();
////        Stack<Character>st=new Stack<>();
////
////
////        for(int i =0;i<exp.length();i++){
////            char ch = exp.charAt(i);
////            if(ch==')') {
////                if (st.peek() == '(') {
////                    System.out.println(true);
////                    return;
////                } else {
////                    while (st.peek() != '(') {
////                        st.pop();
////                    }
////                    st.pop();
////                }
////            }else{
////            st.push(ch);
////            }
////        }
////        System.out.println(false);
////    }
////}
