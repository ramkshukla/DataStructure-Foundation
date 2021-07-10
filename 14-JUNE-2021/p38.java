import java.util.*;
  
  public class p38{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans  = getValue(n, sourceBase, destBase);
     System.out.println(ans);
   }   
   public static int getValue(int n, int b1, int b2){
       int dec = getValueIndecimal(n, b1);
       int dn = getValueInBase(dec, b2);
       return dn;
   }
    public static int getValueInBase(int n, int b){
       int ans = 0;
       for (int i=0; n!=0; i++){
           int r = n%b;
           n = n/b;
           ans = ans+(r*(int)Math.pow(10, i));
       }
       return ans;

   }
   public static int getValueIndecimal(int n, int b){
      int ans = 0;
      for (int i=0; n!=0; i++){
          int r = n%10;
          n/=10;
          ans = ans+(r*(int)Math.pow(b, i));
      }
      return ans;
   }
  }