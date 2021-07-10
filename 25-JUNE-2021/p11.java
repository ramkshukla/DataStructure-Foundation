import java.util.*;
public class p11{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        int x = MaxOfArray(arr, 0);
        System.out.println(x);
    }

    public static int MaxOfArray(int[] arr, int idx){
        if (idx == arr.length - 1)
            return arr[idx];
        int misa = MaxOfArray(arr, idx+1);
        if (misa > arr[idx])
            return misa;
        else
            return arr[idx];
    }
}