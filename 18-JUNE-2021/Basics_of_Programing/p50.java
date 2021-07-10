import java.io.*;
import java.util.*;

public class p50{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i=0; i<a.length; i++)
        a[i] = scn.nextInt();
    
    for (int i=0; i<a.length; i++){
        for (int j=0; j<n; j++){
            for (int k=i; k<=j; k++){
                System.out.print(a[k] + " ");
                if (j == k)
                System.out.println();
            }
        }
    }
 }

}