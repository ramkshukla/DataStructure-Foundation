import java.util.*;
public class p38{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int ans = AnyBaseToAnyBase(n, b1, b2);
        System.out.println(ans);
    }
    public static int AnyBaseToAnyBase(int n, int b1, int b2){
        int dec = anyBaseTODecimal(n, b1);
        int ans = decimalToAnyBase(dec, b2);
        return ans;
    }
    
    public static int anyBaseTODecimal(int n, int b1){
        int ans =0 ;
        for (int i=0; n!=0; i++){
            int r = n%10;
            n/=10;
            ans = ans + (r * (int)Math.pow(b1, i));
        }
        return ans;
    }

    public static int decimalToAnyBase(int n, int b2){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int r = n%b2;
            n/=b2;
            ans = ans + (r * (int)Math.pow(10, i));
        }
        return ans;
    }
}