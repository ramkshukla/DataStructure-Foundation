import java.util.*;
public class p31{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        int fb = fibonaacci(n, arr);
        System.out.println(fb);
    }
    public static int fibonaacci(int n, int[] arr){
        if (n==0 || n==1)
            return n;
        if (arr[n]!=0)
            return arr[n];
        int f = fibonaacci(n-1, arr) + fibonaacci(n-2, arr);
        arr[n] = f;
        return f;

    }
}