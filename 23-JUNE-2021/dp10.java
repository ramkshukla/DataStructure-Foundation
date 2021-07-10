	import java.io.*;
	import java.util.*;

	public class dp10 {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            
            int[] vals = new int[n];
            for (int i=0; i<vals.length; i++)
                vals[i] = scn.nextInt();
            
            int[] wts = new int[n];
            for (int i=0; i<wts.length; i++)
                wts[i] = scn.nextInt();
                
            int cap = scn.nextInt();
            int[] dp = new int[cap+1];
            dp[0] = 0;
            for (int bags=1; bags<=cap; bags++){
                   int max = 0;
                for (int i=0; i<n; i++){
                 
                    if (wts[i] <= bags){
                        int rbags = bags - wts[i];
                        int rbagv = dp[rbags];
                        int tbagv = rbagv + vals[i];
                        if (tbagv >  max){
                            max = tbagv;
                        }
                    }
                }
                dp[bags] = max;
            }
            System.out.println(dp[cap]);
	    }
	}