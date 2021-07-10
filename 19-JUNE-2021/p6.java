import java.util.*;
public class p6{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        System.out.println(count);
    }
}