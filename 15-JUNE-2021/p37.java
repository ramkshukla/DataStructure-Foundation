import java.util.*;
public class p37{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = anyBaseTODecimal(n, b);
        System.out.println(ans);
    }
    public static int anyBaseTODecimal(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%10;
            n/=10;
            ans = ans + (r * (int)Math.pow(b, i));
        }
        return ans;
    }
}