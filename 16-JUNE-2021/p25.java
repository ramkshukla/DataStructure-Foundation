import java.util.*;
public class p25{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}