import java.util.*;
public class p38{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int res = AnyBaseToAnyBase(n, b1, b2);
        System.out.println(res);
    }

    public static int AnyBaseToAnyBase(int n, int b1, int b2){
        int dec = AnyBaseToDecimal(n, b1);
        int ans = DecimalToAnyBase(dec, b2);
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
    public static int AnyBaseToDecimal(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%10;
            n/=10;
            ans = ans + (r * (int)Math.pow(2, i));
        }
        return ans;
    }
}