import java.util.*;
public class p8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        while (temp!=0){
            temp%=10;
            System.out.println(temp);
            temp--;
        }
    }
}