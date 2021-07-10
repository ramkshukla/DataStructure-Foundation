import java.util.*;
public class p79{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        DisplayArr(arr, 0);
    }
    public static void DisplayArr(int[] arr, int idx){
        if (idx == arr.length)
            return;
        System.out.println(arr[idx]);
        DisplayArr(arr, idx+1);
    }
}