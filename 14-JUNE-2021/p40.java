import java.util.*;
  
  public class p40{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int ans = 0;
       int power = 1;
       int borrow = 0;
       while (n2!=0){
           int r1 = n1%10;
           int r2 = n2%10;
           n1/=10;
           n2/=10;

           int diff = (r2-borrow)-r1;
           if (diff < 0){
               diff = diff+b;
               borrow = 1;
           }
           else{
               borrow = 0;
           }
           ans = ans + diff*power;
           power*=10;
       }
       return ans;
   }
  
  }