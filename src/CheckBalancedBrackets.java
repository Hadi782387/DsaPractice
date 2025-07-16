import java.util.*;

public class CheckBalancedBrackets {
    public static void main(String[] args) {

        // step 1:input string from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input for brackets:");
        String str = s.nextLine();

        // step 2: create Stack
        Stack <Character>st = new Stack<>();

        //step 3: loop 0 to str.length for char ch
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            //step 4: if ch == any type of bracket then push
            if (ch=='(' || ch == '{'||ch=='['){
               st.push(ch);
            }else if(ch==')') {
                // if ch == ')' call function store function in bool val if val==false then print false
                boolean val = checkBraces(st, '(');
                if (!val) {
                    System.out.println(val);
                    return;
                }
            }
                else if(ch=='}') {
                // if ch == '}' call function store function in bool val if val==false then print false

                boolean val = checkBraces(st, '{');
                if (!val) {
                    System.out.println(val);
                    return;
                }
            }
                    else if(ch==']'){
                // if ch == ']' call function store function in bool val if val==false then print false

                boolean val = checkBraces(st,'[');
                        if(!val){
                            System.out.println(val);
                            return;
                        }
            }
        }
        System.out.println(st.isEmpty());
    }
    // checkBraces Method if stack is empty return false, if peek() is != corresponding brackets false else st.pop() return true
    public  static  boolean checkBraces(Stack<Character>st,char correspondingCh){
        if(st.isEmpty()){
            return false;
        }else if(st.peek() != correspondingCh){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}

