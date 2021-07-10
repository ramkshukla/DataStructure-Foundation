import java.io.*;
import java.util.*;
public class p2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if (ch == ')'){
                if (st.size() == 0){
                    System.out.println(false);
                    return;
                }else if (st.peek()!= '('){
                    System.out.println(false);
                    return;
                }else{
                    st.pop();
                }
            }else if (ch == '}'){
                if (st.size() == 0){
                    System.out.println(false);
                    return;
                }else if (st.peek() != '{'){
                    System.out.println(false);
                    return;
                }else{
                    st.pop();
                }
            }else if (ch == ']'){
                if (st.size() == 0){
                    System.out.println(false);
                    return;
                }else if (st.peek() != '['){
                    System.out.println(false);
                    return;
                }else{
                    st.pop();
                }
            }
        }

        if (st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}