import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args) {
        //step 1: Declaration.
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Stack<Character>st=new Stack<>();

         // step 2:loop 0 to n-1 index of String.
        for (int i = 0;i<str.length();i++){

            //step 3: Initialize with charAt in i means str.charAt(i)
            char ch = str.charAt(i);

            //step 4: check if there is any opening bracket in string
            if (ch ==')') {

                if (st.peek()=='('){
                    // step 4.1: if there is any opening and closing brackets in string then true and return
                    System.out.println(true);
                    return;
                }else{
                    //step 4.2 if there is no closing bracket in peek then pop until bracket found pop another time after while loop
                    // use while loop
                    while (st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                //step 5: push ch if there is no opening bracket
                st.push(ch);
            }
        }
        //step 6: finally print
        System.out.println(false);
    }
}
