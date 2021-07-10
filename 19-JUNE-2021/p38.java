import java.util.*;
public class p38{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt();
        int d = scn.nextInt();
        int res = AnyBaseToAnyBase(n, s, d);
        System.out.println(res);
    }

    public static int AnyBaseToAnyBase(int n, int s,int d){
        int dec = AnyBaseToDecimal(n, s);
        int ans = DecimalToAnyBase(dec, d);
        return ans;
    }

    public static int AnyBaseToDecimal(int n, int s){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%10;
            n/=10;
            ans = ans+(r * (int)Math.pow(s, i));
        }
        return ans;
    }
    public static int DecimalToAnyBase(int n, int d){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%d;
            n/=d;
            ans = ans + (r * (int)Math.pow(10, i));
        }
        return ans;
    }
}