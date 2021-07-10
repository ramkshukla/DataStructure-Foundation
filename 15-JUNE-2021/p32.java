import java.util.*;
public class p32{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        int stars = n;
        for (int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++){
                if (i>0 &&  j>0 && i<n/2 && j < stars-1)
                    System.out.print(" ");
                else    
                    System.out.print("*");

            }
            System.out.println();
            if (i<n/2){
                stars-=2;
                spaces+=1;
            }else{
                stars+=2;
                spaces-=1;
            }
        }
    }
}