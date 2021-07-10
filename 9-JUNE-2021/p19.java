import java.util.*;
public class p19    {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int spaces = n/2;
        for (int j=0; j<n; j++){
            for (int i=0; i<spaces; i++){
                System.out.print(" ");
            }
            for (int i=0; i<star; i++){
                System.out.print("* ");
            }
            System.out.println();
            if (j < n/2){
                star = star + 1;
                spaces = spaces - 1;
            }
            else{
                star = star - 1;
                spaces = spaces + 1;
            }
        }
    }
}