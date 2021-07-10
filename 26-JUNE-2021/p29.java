import java.util.*;
public class p29{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();
        
        int k = scn.nextInt();
        int[][] dp = new int[k+1][n];
        for (int t=1; t<=k; t++){
            for (int d=1; d<arr.length; d++){
                int max = dp[t][d-1];

                for (int pd=0; pd<d; pd++){
                    int ptilltm1 = dp[t-1][pd];
                    int pth = arr[d] - arr[pd];

                    if (ptilltm1+pth > max){
                        max = ptilltm1 + pth;
                    }
                }
                dp[t][d] = max;
            }
        }
        System.out.println(dp[k][n-1]);
    }
}