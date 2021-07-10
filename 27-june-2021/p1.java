// Print Decreasing
import java.util.*;
public class p1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pD(n);
    }
    public static void pD(int n){
        if (n==0)
            return;
        System.out.println(n);
        pD(n-1);
    }
}