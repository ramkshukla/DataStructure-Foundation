import java.util.*;
public class p75{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }
    public static int factorial(int n){
        if (n==0)
            return 1;
        int x = n * factorial(n-1);
        return x;
    }
}