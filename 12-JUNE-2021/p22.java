import java.util.*;
public class p22{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n-1;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print("\t");
            }
            for (int j=0; j<stars; j++){
                System.out.print("*\t");
            }
            System.out.println();
            spaces = spaces - 1;
        }
    }
}