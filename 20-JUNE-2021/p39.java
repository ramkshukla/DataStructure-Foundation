import java.util.*;
public class p39{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int res = getSum(b, n1, n2);
        System.out.println(res);
    }

    public static int getSum(int b, int n1, int n2){
        int carry = 0;
        int ans = 0;
        int power = 1;
        while(n1!=0 || n2!=0 || carry>0){
            int r1 = n1%10;
            int r2 = n2%10;
            n1/=10;
            n2/=10;

            int sum = r1 + r2 + carry;
            int q = sum/b;
            int r = sum%b;

            ans = ans + (r * power);
            carry = q;
            power*=10;
        }
        return ans;
    }
}