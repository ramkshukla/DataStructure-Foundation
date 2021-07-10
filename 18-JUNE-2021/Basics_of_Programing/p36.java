import java.util.*;
  
  public class p36{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int ans = 0;
       for (int i=0; n!=0; i++){
           int r = n%b;
           n/=b;
           ans = ans + (r * (int)Math.pow(10, i));
       }
       return ans;
   }
  }