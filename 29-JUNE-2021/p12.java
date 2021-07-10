import java.util.*;
public class p12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ocones = 1;
        int oczeroes = 1;
        for (int i=2; i<=n; i++){
            int nczeroes = ocones;
            int ncones = oczeroes + ocones;

            ocones = ncones;
            oczeroes = nczeroes;
        }
        System.out.println(oczeroes+ocones);
    }
}