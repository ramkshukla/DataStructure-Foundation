import java.util.*;
public class p27{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=0; i<n; i++){
            int ov = 1;
            for (int j=0; j<=i; j++){
                System.out.print(ov +" ");
                int nv = ov * (i-j)/(j+1);
                ov = nv;
            }
            System.out.println();
        }
    }
}