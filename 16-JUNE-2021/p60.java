import java.io.*;
import java.util.*;

public class p60 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr;
        arr = new int [n][m];
        
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        rotateShell(arr,s,r);
        display(arr);
    }

    // Rotate Shell
    public static void rotateShell(int [][] arr, int s, int r){
        int[] oned = fillonedfromshell(arr, s);
        rotate(oned, r);
        fillshellfromoned(arr, s, oned);
    }
    
    // Rotate Oned Array
    public static void rotate(int [] oned, int r){
        r = r % oned.length;
        if (r<0){
            r = r + oned.length;
        }
        reverse(oned, 0, oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0, oned.length-1);
    }
    
    public static void reverse(int [] oned, int li, int ri){
        while (li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }
    
    
    // Fill Oned fron Shell
    public static int[] fillonedfromshell(int [][] arr, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        
        int size = 2 * (maxr-minr + maxc-minc);
        
        int [] oned;
        oned = new int[size];
        
        // left wall
        int index = 0;
        for (int i = minr, j = minc; i <= maxr; i++){
            oned[index] = arr[i][j];
            index++;
        }
        
        //botton wall
        for (int i = maxr, j = minc+1; j <= maxc; j++){
            oned[index] = arr[i][j];
            index++;
        }
        
        // right wall;
        for (int i = maxr-1, j = maxc; i >= minr; i--){
            oned[index] = arr[i][j];
            index++;
        }
        //top wall
        for (int i = minr, j = maxc-1; j >= minc+1; j--){
            oned[index] = arr[i][j];
            index++;
        }
        return oned;
    }
    
    // Fill Shell from Oned
    public static void fillshellfromoned(int [][]arr, int s, int [] oned){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        
       // left wall
        int index = 0;
        for (int i = minr, j = minc; i <= maxr; i++){
            arr[i][j] = oned[index];
            index++;
        }
        
        //botton wall
        for (int i = maxr, j = minc+1; j <= maxc; j++){
            arr[i][j] = oned[index];
            index++;
        }
        
        // right wall;
        for (int i = maxr-1, j = maxc; i >= minr; i--){
            arr[i][j] = oned[index];
            index++;
        }
        //tw
        for (int i = minr, j = maxc-1; j >= minc+1; j--){
            arr[i][j] = oned[index];
            index++;
        }
    }
    
    
    // Display 
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}