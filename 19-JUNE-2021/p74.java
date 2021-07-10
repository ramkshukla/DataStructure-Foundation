import java.util.*;
public class p74{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if (n == 0)
            return 1;
        int m = x*power(x, n-1);
        return m;
    }
}