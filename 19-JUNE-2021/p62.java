import java.util.*;
public class p62{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i=0; i<arr.length; i++){
            int svj = 0;
            for (int j=1; j<arr[i].length; j++){
                if (arr[i][j] < arr[i][svj])    
                    svj = j;
            }

            boolean flag = true;
            for (int k=0; k<arr.length; k++){
                if (arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
                    
            }
            if (flag == true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }
}