import java.util.*;
public class p7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while (temp!=0){
            temp/=10;
            count++;
        }
        int div = (int)Math.pow(10, count-1);
        while(div!=0){
            int q = n/div;
            System.out.println(q);
            n = n%div;
            div = div/10;
        }
    }
}