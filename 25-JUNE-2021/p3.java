import java.util.*;
public class p3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }
    public static void pdi(int n){
        if (n==0)
            return;
        printDecreasing(n);

        printIncreasing(n);
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