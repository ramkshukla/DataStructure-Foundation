import java.util.*;
public class p20{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 1;
        int stars = n/2+1;
        for (int i=0; i<n; i++){
            for (int j=0; j<stars; j++){
                System.out.print("*");
            }
            for (int j=0;j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i < n/2){
                stars--;
                spaces+=2;
            }else{
                spaces-=2;
                stars++;
            }
        }
    }
}