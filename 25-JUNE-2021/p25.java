import java.util.*;
public class p25{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutation(str, "");
    }

    public static void printPermutation(String str, String asf){
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String q1part = str.substring(0, i);
            String q2part = str.substring(i+1);
            String roq = q1part + q2part;
            printPermutation(roq, asf+ch);
        }
    }
}