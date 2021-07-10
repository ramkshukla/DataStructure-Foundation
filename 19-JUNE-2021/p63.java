import java.util.*;
public class p63{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr;
        arr = new int[n][n];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int c = 0;
        int data = scn.nextInt();

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (data == arr[i][j]){
                    System.out.println(i);
                    System.out.println(j);
                    c = 1;
                    break;
                }
            }

        }
        if (c == 0)
            System.out.println("Not Found");
    }
}