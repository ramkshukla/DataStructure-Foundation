import java.util.*;
public class p44{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int max =arr[0];
        for (int i=0; i<n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i=max; i>=1; i--){
            for (int j=0; j<arr.length; j++){
                if (arr[j] >= i){
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