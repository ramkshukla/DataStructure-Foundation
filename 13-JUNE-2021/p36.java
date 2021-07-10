import java.util.*;
public class p36{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueInBase(n, b);
        System.out.println(d);
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
}