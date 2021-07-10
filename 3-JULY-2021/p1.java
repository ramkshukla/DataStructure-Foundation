import java.io.*;
import java.util.*;
public class p1{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opd = new Stack<>();
        Stack<Character> opr = new Stack<>();
        
        for (int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '('){ 
                opr.push(ch);
            }else if (Character.isDigit(ch)){
                opd.push(ch - '0'); //char to int
            }else if (ch == ')'){
                while(opr.peek() != '('){
                    char op = opr.pop();
                    int v2 = opd.pop();
                    int v1 = opd.pop();
                    int opv = operation(v1, v2, op);
                    opd.push(opv);
                }
                opr.pop();
            }else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opr.size() > 0 && opr.peek() != '('
                        && precedence(ch) <= precedence(opr.peek())
                    ){
                    char op = opr.pop();
                    int v2 = opd.pop();
                    int v1 = opd.pop();
                    int opv = operation(v1, v2, op);
                    opd.push(opv);
                    }
                 opr.push(ch);
            }
        }
        while(opr.size() != 0){
                    char op = opr.pop();
                    int v2 = opd.pop();
                    int v1 = opd.pop();
                    int opv = operation(v1, v2, op);
                    opd.push(opv);
                }
        
        System.out.println(opd.peek());

    }
    public static int precedence(char operator){
        if (operator == '+'){
            return 1;
        }else if (operator == '-'){
            return 1;
        }else if (operator == '*'){
            return 2;
        }else{
            return 2;
        }
    }
    public static int operation(int v1, int v2, char operator){
         if (operator == '+'){
            return v1 + v2;
        }else if (operator == '-'){
            return v1 - v2;
        }else if (operator == '*'){
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }
}