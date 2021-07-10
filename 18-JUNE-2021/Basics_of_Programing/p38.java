import java.util.*;
  
  public class p38{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int res = AnyBaseToAnyBase(n, sourceBase, destBase);
     System.out.println(res);
   }   
   public static int AnyBaseToAnyBase(int n, int sourceBase, int destBase){
       int dec = getValueIndecimal(n, sourceBase);
       int ans = getValueInBase(dec, destBase);
       return ans;
   }
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int ans = 0;
      for (int i=0; n!=0; i++){
          int r = n%10;
          n/=10;
          ans = ans + (r * (int)Math.pow(b, i));
      }
      return ans;
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