import java.util.*;
public class p60{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int d=0; d<n; d++){
            for (int i=0, j=d; j<n; j++, i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}