import java.util.*;
public class p58{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        // Transpose
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse
        for (int i=0; i<n; i++){
            int left=0;
            int right = arr[i].length-1;
            while (left<=right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        display(arr);
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}