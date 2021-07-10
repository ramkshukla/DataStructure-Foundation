import java.util.*;
public class p22{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        printStairs(n, "");
    }
    public static void printStairs(int n, String path){
        if (n<0){
            return;
        }
        if (n ==0){
            System.out.println(path);
        }
        printStairs(n-1, path+"1");
        printStairs(n-2, path+"2");
        printStairs(n-3, path+"3");
    }
}