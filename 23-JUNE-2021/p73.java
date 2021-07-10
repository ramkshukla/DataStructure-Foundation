import java.util.*;
public class p73{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int p = power(n, x);
        System.out.println(p);
    }

    public static int power(int n, int x){
        if(n == 0)
            return 0;
        if (x == 0)
            return 1;
        int p = n * power(n, x-1);
        return p;
    }
}