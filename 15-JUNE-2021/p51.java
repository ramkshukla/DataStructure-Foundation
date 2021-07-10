import java.io.*;
import java.util.*;
public class p51{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = scn.nextInt();
        
        int left = 0;
        int right = a.length - 1;
        int data = scn.nextInt();
        int ceil = -1;
        int floor = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (a[mid] == data){
                ceil = data;
                floor = data;
            }
            else if (a[mid] < data){
                left = mid + 1;
                floor = a[mid];
            }
            else{
                right =mid - 1;
                ceil = a[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
