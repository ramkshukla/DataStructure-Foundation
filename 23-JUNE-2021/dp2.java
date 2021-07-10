import java.util.*;
public class dp2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n+1];
        int ans = countPathsTab(n);
        System.out.println(ans);
    }

    public static int countPaths(int n, int[] arr){
        if (n==0)
            return 1;
        if (n<0)
            return 0;
        if (arr[n] != 0)
            return arr[n];
        
        int path1 = countPaths(n-1, arr);
        int path2 = countPaths(n-2, arr);
        int path3 = countPaths(n-3, arr);

        int path = path1 + path2 + path3;
        arr[n] = path;
        return path;
    }

    public static int countPathsTab(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=1; i<=n; i++){
            if (i==1)
                dp[i] = dp[i-1];
            else if (i==2)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];

    }
}