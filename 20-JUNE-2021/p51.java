import java.util.*;
public class p51{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n; i++)
            arr[i] = scn.nextInt();

        int data = scn.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;
        int floor = -1;
        while (left<=right){
            int  mid = (left + right)/2;
            if (arr[mid] > data){
                ceil = arr[mid];
                right = mid-1;
            }
            else if (arr[mid] < data){
                floor = arr[mid];
                left = mid+1;
            }
            else{
                ceil = data;
                floor = data;
            }
                
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}