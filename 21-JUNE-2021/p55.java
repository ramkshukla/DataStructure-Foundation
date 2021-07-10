import java.util.*;
public class p55{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i=0; i<arr.length; i++){
            int min = arr[i][0];
            int colno = 0;
            for (int col=1; col<arr.length; col++){
                if (arr[i][col] < min){
                    min = arr[i][col];
                    colno = col;
                }
            }

            boolean vc = true;
            for (int row=0; row<n; row++){
                if (arr[row][colno]>min){
                    vc=false;
                    break;
                }
            }
            if (vc == true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid Input");
    }
}