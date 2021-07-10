import java.util.*;
public class p12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oczeroes = 1;
        int ocones = 1;
        for (int i=2; i<=n; i++){
            int nczeroes = ocones;
            int ncones = oczeroes + ocones;

            oczeroes = nczeroes;
            ocones = ncones;
        }
        System.out.println(oczeroes + ocones);
    }
}