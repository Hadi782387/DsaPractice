import java.io.*;
import java.util.Stack;

public class PostfixConversions {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer>value=new Stack<>();
        Stack<String>infix = new Stack<>();
        Stack<String>prefix = new Stack<>();

        for(int i =0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 = value.pop();
                int v1= value.pop();
                int val=operation(ch,v1,v2);
                value.push(val);

                String iv2 = infix.pop();
                String iv1= infix.pop();
                String i_val = "(" + iv1 + iv2+")";
                infix.push(i_val);

                String pv2 = prefix.pop();
                String pv1 = prefix.pop();
                String p_val = ch+pv1+pv2;
                prefix.push(p_val);

            }else{
                value.push(ch-'0');
                infix.push(ch+"");
                prefix.push(ch+"");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }

    public static int operation(char ch,int v1,int v2) {
        // method for + - * / operation
        if (ch=='+') return v1 + v2;
        else if(ch=='-') return v1-v2;
        else if(ch=='*') return v1*v2;
        else if(ch=='/') return v1/v2;

   else{
       return 0;
        }
    }
}
