import java.util.*;
  
  public class p38{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = AnyBaseToAnyBase(n, sourceBase, destBase);
     System.out.println(ans);
   }  
   public static int AnyBaseToAnyBase(int n, int sb, int db){
       int dec = getValueIndecimal(n, sb);
       int res = getValueInBase(dec, db);
       return res;
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
       int ans =0;
       for (int i=0; n!=0; i++){
           int r = n%b;
           n/=b;
           ans = ans + (r*(int)Math.pow(10, i));
       }
       return ans;
   } 
  }