import java.util.*;
public class p18{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n;
        int spaces = 0;
        for (int i=1; i<=n; i++){
             for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
           
            System.out.println();
            stars = stars-1;
            spaces=spaces+1;
        }
    }
}