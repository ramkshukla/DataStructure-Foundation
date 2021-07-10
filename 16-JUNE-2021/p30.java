import java.util.*;
public class p30{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 2*n-3;
        int x = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            if (x == n)
                x-=1;

            for (int j=x; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
            x++;
        }
    }
}