import java.util.*;
public class p59{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr;
        arr = new int[n][n];

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
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
        for (int i=0; i<arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while (li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }   
}