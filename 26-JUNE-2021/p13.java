import java.util.*;
public class p13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long ob = 1;
        long os = 1;
        for (int i=2; i<=n; i++){
            long nb = os;
            long ns = os + ob;

            os = ns;
            ob = nb;
        }
        long total = os + ob;
        System.out.println(total*total);
    }
}