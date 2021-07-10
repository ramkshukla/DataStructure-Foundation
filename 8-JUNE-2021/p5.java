import java.util.*;
public class p5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c;
        while (n!=0){
            c= a+b;
            System.out.println(a);
            a = b;
            b = c;
            n--;
        }
    }
}