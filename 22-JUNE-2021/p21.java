import java.util.*;
public class p21{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        int stars = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }
    }
}