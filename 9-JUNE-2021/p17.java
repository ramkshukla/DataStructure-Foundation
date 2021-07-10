import java.util.*;
public class p17{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int spaces = n;
        for (int j=0; j<n; j++){
            for (int i=0; i<spaces; i++){
                System.out.print(" ");
            }
            for (int i=0; i<star; i++){
                System.out.print("* ");
            }
            System.out.println();
            star = star + 1;
            spaces = spaces - 1;
        }
    }
}