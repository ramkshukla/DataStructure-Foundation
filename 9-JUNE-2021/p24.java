import java.util.*;

public class p24{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int star = 1;
     int spaces = n/2;
     for (int i=1; i<=n; i++){
         for (int j=1; j<=spaces; j++){
             System.out.print("	");
         }
         for (int j=1; j<=star; j++){
             if (j==1 || j==star){
                 System.out.print("*	");
             }
             
             else{
                System.out.print("	"); 
             }
             
         }
         System.out.println();
         if (i<=n/2){
             star += 2;
             spaces  -= 1;
         }
         else {
             star -=2;
             spaces += 1;
         }
     }
     

 }
}