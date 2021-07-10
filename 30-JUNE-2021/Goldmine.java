import java.util.*;
public class Goldmine{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        int[][] Goldmine = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0;j<column; j++){
                Goldmine[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[row][column];
        for (int j=dp[0].length-1; j>=0; j--){
            for (int i=dp.length-1; i>=0; i--){
                if (j == dp[0].length-1)
                    dp[i][j] = Goldmine[i][j];
                else if (i == 0)
                    dp[i][j] = Goldmine[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                else if (i == dp.length - 1)
                    dp[i][j] = Goldmine[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                else    
                    dp[i][j] = Goldmine[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
            }
        }
        int max = dp[0][0];
        for (int i=1; i<dp.length; i++){
            if (dp[i][0] > max)
                max = dp[i][0];
        }
        System.out.println(max);
    }
}