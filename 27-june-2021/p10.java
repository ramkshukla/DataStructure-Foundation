import java.util.*;
public class p10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr =  new int[n];
        for (int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();
        display(arr, 0);
    }
    public static void display(int[] arr, int idx){
        if (idx == arr.length)
            return;
         display(arr, idx+1);
        System.out.println(arr[idx]);
       
    }
}