import java.util.*;
public class p54{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();
        int c = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i][j] == data){
                    System.out.println(i);
                    System.out.println(j);
                    c= 1;
                    break;
                }
            }
        }
        if (c == 0)
            System.out.println("not found");
    }
}