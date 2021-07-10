import java.util.*;
public class p8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp  = n;
        int count = 0;
        while (temp!=0){
            int r = temp%10;
            System.out.println(r);
            temp/=10;
        }
    }
}