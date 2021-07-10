import java.util.*;
public class p2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (ch == ')'){
                boolean val = resultHandle(st, '(');
                    if (val == false){
                        System.out.println(val);
                        return;
                    }
                
            }
            else if (ch == '}'){
                boolean val = resultHandle(st, '{');
                    if (val == false){
                        System.out.println(val);
                        return;
                    }
                
            }
            else if (ch == ']'){
                boolean val = resultHandle(st, '[');
                    if (val == false){
                        System.out.println(val);
                        return;
                    }
                
            }
        }


        if (st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean resultHandle(Stack<Character> st, char ch){
        if (st.size() == 0){
            return false;
        }else if (st.peek() != ch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}