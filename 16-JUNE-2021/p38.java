import java.util.*;
public class p38{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int sb = scn.nextInt();
        int db = scn.nextInt();
        int res = AnyBaseToAnyBase(b, sb, db);
        System.out.println(res);
    }
    public static int AnyBaseToAnyBase(int b, int sb, int db){
        int dec = AnyBaseToDecimal(b, sb);
        int dn = DecimalToAnyBase(dec, db);
        return dn;
    }
    public static int AnyBaseToDecimal(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%10;
            n/=10;
            ans = ans + (r * (int)Math.pow(b, i));
        }
        return ans;
    }
    public static int DecimalToAnyBase(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%b;
            n/=b;
            ans = ans + (r * (int)Math.pow(10, i));
        }
        return ans;
    }
}