import java.util.*;
public class p61{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr;
        arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        saddlePrice(arr);
    }

    public static void saddlePrice(int[][] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            int min = arr[i][0];
            int colno = 0;
            for (int col=1; col<n; col++){
                if (arr[i][col] < min){
                    min = arr[i][min];
                    colno = col;
                }
                boolean vc = true;
                for (int row=0; row<n; row++){
                    if (arr[row][colno] > min){
                        vc = false;
                        break;
                    }
                }
                if (vc == true){
                    System.out.println(min);
                    return;
                }
            }
        
        }
        System.out.println("Invalid input");
    }
}