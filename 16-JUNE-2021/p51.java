import java.io.*;
import java.util.*;

public class p51{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for (int i=0; i<n; i++)
        arr[i] = scn.nextInt();
        
        int left = 0;
        int right = arr.length - 1;
        int data = scn.nextInt();
        int ceil = -1, floor=-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == data){
                ceil = data;
                floor = data;
            }else if(arr[mid] < data){
                left = mid + 1;
                floor = arr[mid];
            }else{
                right = mid - 1;
                ceil = arr[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
        
    }
 }