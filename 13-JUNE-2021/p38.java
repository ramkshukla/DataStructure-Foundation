import java.util.*;
public class p38{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int scb = scn.nextInt();
        int dcb = scn.nextInt();
        int d = getValueAnyBaseToBase(n, scb, dcb);
        System.out.println(d);
    }
    public static int getValueAnyBaseToBase(int n, int scb, int dcb){
        int dec = getValueInDecimal(n, scb);
        int b = getValueInBase(dec, dcb);
        return b;
    }
    public static int getValueInBase(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int rem = n%b;
            n = n/b;
            ans = ans + (rem * (int)Math.pow(10, i));
        }
        return ans;
    }
     public static int getValueInDecimal(int n, int b){
        int ans = 0;
        for (int i=0; n!=0; i++){
            int rem = n%10;
            n = n/10;
            ans = ans + (rem * (int)Math.pow(b, i));
        }
        return ans;
    }
}