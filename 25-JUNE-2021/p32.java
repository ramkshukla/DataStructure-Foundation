import java.util.*;
public class p32{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n+1];
        int c = countPaths(n, arr);
        System.out.println(c);
    }

    public static int countPaths(int n, int[] arr){
        if (n==0)
            return 1;
        if (n<0)
            return 0;
        if (arr[n]!=0)
            return arr[n];
        int path1 = countPaths(n-1, arr);
        int path2 = countPaths(n-2, arr);
        int path3 = countPaths(n-3, arr);
        int path = path1 + path2 + path3;
        arr[n] = path;
        return path;
    }
}