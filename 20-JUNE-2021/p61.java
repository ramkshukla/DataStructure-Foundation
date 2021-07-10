import java.util.*;
public class p61{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for (int d=0; d<arr.length; d++){
            for (int i=0, j=d; j<arr.length; i++, j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}