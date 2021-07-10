import java.util.*;
public class p55{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i=0; i<arr1.length; i++)
            for (int j=0; j<arr1[i].length; j++)
                arr1[i][j] = scn.nextInt();

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = new int[n2][m2];
        for (int i=0; i<arr2.length; i++)
            for (int j=0; j<arr2[i].length; j++)
                arr2[i][j] = scn.nextInt();
            
        int[][] res = new int[n1][m2];
        if (n2 == m1){
            int sum = 0;
            for (int i=0; i<n1; i++){
                for (int j=0; j<m2; j++){
                    for (int k=0; k<m1; k++){
                        sum = sum + arr1[i][k] * arr2[k][j];
                    }
                    res[i][j] = sum;
                    sum=0;
                }
            }

            for (int i=0; i<res.length; i++){
                for (int j=0; j<res[i].length; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}