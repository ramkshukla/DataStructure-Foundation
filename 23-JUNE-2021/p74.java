import java.util.*;
public class p74{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int p = power(n, x);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if (n == 0)
            return 1;
        int xpnb2 = power(x, n/2);
        int xn = xpnb2 * xpnb2;
        if (n%2 == 1)
            xn = xn * x;
        return xn;
    }
}