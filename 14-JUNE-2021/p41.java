import java.util.*;
public class p41{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int getProduct(int b, int n1, int n2){
        int ans = 0;
        int power = 1;
        while (n2!=0){
            int r2 = n2%10;
            n2/=10;

            int sp = getProductSingleDigit(b, n1, r2);
            ans = getSum(b, ans, sp*power);
            power*=10;
        }
        return ans;
    }
    public static int getProductSingleDigit(int b, int n1, int n2){
        int carry=0;
        int ans = 0;
        int power = 1;
        while (n1!=0 || carry!=0){
            int r1 = n1%10;
            n1/=10;

            int mul = r1 * n2 + carry;
            int q = mul / b;
            carry = q;

            int r = mul % b;
            ans = ans + r * power;
            power*=10;
        }
        return ans;
    }
    public static int getSum(int b, int n1, int n2){
        int ans = 0;
        int power = 1;
        int carry = 0;
        while(n1!=0 || n2!=0 || carry!=0){
            int r1 = n1%10;
            int r2 = n2%10;

            n1/=10;
            n2/=10;

            int sum = r1 + r2 + carry;
            int q = sum/b;
            int r = sum%b;

            ans = ans + r * power;
            carry = q;
            power *=10;
        }
        return ans;
    }
}