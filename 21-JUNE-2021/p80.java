import java.util.*;
public class p80{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        ReverseArr(arr, 0);
    }
    public static void ReverseArr(int[] arr, int idx){
        if (idx==arr.length)
            return;
        ReverseArr(arr, idx+1);
        System.out.println(arr[idx]);
    }
}