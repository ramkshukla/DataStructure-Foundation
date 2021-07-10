import java.util.*;
public class p29{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int star = 1;
        int val = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            int cval = val;
            for (int j=1; j<=star; j++){
                System.out.print(cval + " ");
                if (j <= star/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            System.out.println();
            if (i<=n/2){
                star = star+2;
                spaces = spaces-1;
                val++;
            }
            else{
                star = star-2;
                spaces = spaces+1;
                val--;
            }
        }
    }
}