import java.util.*;
public class p54{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i=0; i<arr1.length; i++)
            for (int j=0; j<arr1[i].length; j++)
                arr1[i][j] = scn.nextInt();

        for (int i=0; i<arr1.length; i++){}
            for (int j=0; j<arr1[i].length; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();
        
    }
}