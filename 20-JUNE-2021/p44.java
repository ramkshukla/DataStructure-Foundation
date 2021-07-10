import java.util.*;
public class p44{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int max = arr[0];
        for(int i=0; i<arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        
        for (int j=max; j>=1; j--){
            for (int i=0; i<arr.length; i++){
                if (arr[i] >= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}