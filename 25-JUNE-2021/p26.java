import java.io.*;
import java.util.*;

public class p26 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String str, String asf) {
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        if (str.charAt(0) == '0')
            return;
            
        String ch0 = str.substring(0, 1);
        int val = Integer.parseInt(ch0);
        String ros1 = str.substring(1);
        printEncodings(ros1, asf+(char)('a' + val-1));
        
        if (str.length() >= 2){
            String ch01 = str.substring(0, 2);
            val = Integer.parseInt(ch01);
            String ros2 = str.substring(2);
            if (val <= 26){
                printEncodings(ros2, asf+(char)('a'+val-1));
            }
        }
    }

}