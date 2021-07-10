import java.util.*;
public class dp1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        int f = fibonacci(n, arr);
        System.out.println(f);
    }

    public static int fibonacci(int n, int[] arr){
        if (n==0 || n==1)
            return n;
        if (arr[n]!=0)
            return arr[n];
        int fib1 = fibonacci(n-1, arr);
        int fib2 = fibonacci(n-2, arr);
        int fib = fib1 + fib2;
        arr[n] = fib;
        return fib;
    }
}