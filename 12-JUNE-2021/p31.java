import java.util.*;
public class p31{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n/2;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                if (i == n/2){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for (int j=0; j<stars; j++){
                System.out.print("*\t");
            }
            if (i<n/2){
                stars++;
            }else{
                stars--;
            }
            System.out.println();
        }
    }
}