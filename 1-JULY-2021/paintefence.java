import java.util.*;
public class paintefence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long sum = k*1;
        long diff = k * (k-1);
        long total = sum + diff;

        for (int i=3; i<=n; i++){
            sum = diff * 1;
            diff = total * (k-1);
            total  = sum + diff;
        }
        System.out.println(total);
    }
}