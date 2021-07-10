import java.util.*;
   
   public class p8{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     while (n!=0){
         int r = n%10;
          n/=10;
         System.out.println(r);
        
     }
    }
   }