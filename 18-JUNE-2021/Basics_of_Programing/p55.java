import java.util.*;
public class p55{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for (int i=0; i<a1.length; i++){
            for (int j=0; j<a1[i].length; j++){
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for (int i=0; i<a2.length; i++){
            for (int j=0; j<a2[i].length; j++){
                a2[i][j] = scn.nextInt();
            }
        }

        int[][] res = new int[n1][m2];
        if (m1 == n2){
            int sum = 0;
            for (int i=0; i<n1; i++){
                for (int j=0; j<m2; j++){
                    for (int k=0; k<m1; k++){
                        sum = sum + a1[i][k] * a2[k][j];
                    }
                    res[i][j] = sum;
                    sum = 0;
                }
            }

            for (int i=0; i<res.length; i++){
                for (int j=0; j<res[i].length; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}