import java.util.*;
public class p36{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = DecimalToAnyBase(n, b);
        System.out.println(res);
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