import java.util.*;
public class p1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        int f = finbonacci(n, arr);
        System.out.println(f);
    }
    public static int finbonacci(int n, int[] arr){
        if (n==0 || n==1)
            return n;
        if (arr[n]!=0)
            return arr[n];
        int f = finbonacci(n-1, arr) + finbonacci(n-2, arr);
        arr[n] = f;
        return f;
    }
}