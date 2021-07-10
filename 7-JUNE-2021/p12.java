import java.util.*;
public class p12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int div = 2; div*div <= n; div++){
            while (n%div == 0)
               {
                   n/=div;
                   System.out.print(div + " ");
               } 
        }
        if (n!=1){
            System.out.println(n);
        }
    }
}