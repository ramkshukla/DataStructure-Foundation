import java.util.*;
public class p76{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power(x, n);
        System.out.println(p);
    }
    public static int power(int x, int n){
        if (n==0)
            return 1;
        int a = x * power(x, n-1);
        return a;
    }
}