import java.util.*;

public class p33 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int i=0; i<=n-1; i++){
            for (int j=0; j<=n-1; j++){
                if (i < n/2){
                    if (j <= n/2){
                        if (i == 0 && j <= n/2)
                            System.out.print("*	");
                        else if (j == n/2)
                            System.out.print("*	");
                        else
                            System.out.print("	");
                    }
                    else{
                        if (j == n-1)
                            System.out.print("*	");
                        else
                            System.out.print("	");
                    }
                }
                
                else if (i == n/2)
                    System.out.print("*	");
            
                else {
                    if (j >= n/2){
                        if (i == n-1 && j>=n/2)
                            System.out.print("*	");
                        else if (j == n/2)
                            System.out.print("*	");
                        else
                            System.out.print("	");
                    }
                    else{
                        if (j == 0)
                            System.out.print("*	");
                        else
                            System.out.print("	");
                    }
                }
            } 
            System.out.println();
            
        }

    }
}