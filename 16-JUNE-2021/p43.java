import java.util.*;
public class p43{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int data = scn.nextInt();
        int idx = -1;
        for (int i=0; i<n; i++){
            if (data == arr[i]){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}