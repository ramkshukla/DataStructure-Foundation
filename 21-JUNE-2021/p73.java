import java.util.*;
public class p73{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasingDecresing(n);
    }

    public static void printIncreasingDecresing(int n){
        if (n==0)
            return;
        printIncreasing(n);
        printDecreasing(n);
    }

    public static void printIncreasing(int n){
        if (n==0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void printDecreasing(int n){
        if (n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}