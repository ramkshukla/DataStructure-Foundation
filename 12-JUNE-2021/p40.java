import java.util.*;
public class p40{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int d = getDiffrence(b, b1, b2);
        System.out.println(d);
    }
    public static int getDiffrence(int b, int n1, int n2){
        int ans = 0, pow = 1, borrow = 0;
        while(n2!=0){
            int l1 = n1%10;
            int l2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int diff = (l2 - borrow) - l1;
            if (diff < 0){
                diff = diff + b;
                borrow = 1;
            }else{
                borrow = 0;
            }
            ans = ans + diff * pow;
            pow *= 10;
        }
        return ans;
    }
}