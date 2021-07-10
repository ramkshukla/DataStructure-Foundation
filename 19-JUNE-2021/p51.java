// Broken Economy
import java.util.*;
public class p51{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int data = scn.nextInt();
        int low = 0;
        int high = arr.length-1;
        int ceil = -1;
        int floor = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == data){
                ceil = data;
                floor = data;
            }
            else if (data >  arr[mid]){
                floor = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
                ceil = arr[mid];
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}