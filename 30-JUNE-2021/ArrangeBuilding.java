import java.util.*;
public class ArrangeBuilding{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();

        long ob = 1;
        long os = 1;
        for (int i=2; i<=n; i++){
            long nb = os;
            long ns = ob + os;

            ob = nb;
            os = ns;
        }
        long total = ob + os;
        total = total * total;
        System.out.println(total);
    }
}