// Print Increasing Decreasing
import java.util.*;
public class p3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PID(n);
    }
    public static void PID(int n){
        if (n==0)
            return;
        pI(n);
        pD(n);
        
    }
     public static void pI(int n){
        if (n==0)
            return;
        pI(n-1);
        System.out.println(n);
        
    }
    public static void pD(int n){
        if (n==0)
            return;
        System.out.println(n);
        pD(n-1);
    }
}