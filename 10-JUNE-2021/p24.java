import java.util.*;
public class p24{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++){
                if (j==0 || j==stars-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i<n/2){
                stars = stars+2;
                spaces = spaces-1;
            }else{
                stars = stars-2;
                spaces = spaces + 1;
            }
        }
    }
}