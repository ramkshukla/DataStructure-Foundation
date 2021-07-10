import java.util.*;
public class p81{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.print(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if (idx == arr.length)
            return -1;
        
        if (arr[idx] == x)
            return idx;
        else{
            int fi = firstIndex(arr, idx+1, x);
            return fi;
        }

    }
}