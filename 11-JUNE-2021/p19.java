import java.util.*;
public class p19{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n/2;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n/2){
                stars = stars+2;
                spaces = spaces-1;
            }else{
                stars = stars-2;
                spaces = spaces+1;
            }
        }
    }
}