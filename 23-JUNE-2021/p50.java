import java.util.*;
public class p50{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int data = scn.nextInt();
        int ceil = -1;
        int floor = -1;
        while (left <= right){
            int mid = (left  + right) / 2;
            if (data == arr[mid]){
                ceil = data;
                floor = data;
            }else if (data > arr[mid]){
                floor = arr[mid];
                left = mid+1;
            }else{
                right = mid-1;
                ceil = arr[mid];

            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}