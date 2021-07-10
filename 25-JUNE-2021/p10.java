import java.util.*;
public class p10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        ArrayReverse(arr, 0);
    }
    public static void ArrayReverse(int[] arr, int idx){
        if (idx == arr.length)
            return;
        ArrayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}