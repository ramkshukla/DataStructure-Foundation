import java.util.*;
public class p57{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total = n*m;
        int counter = 0;
        while(counter < total){
            // left wall
            for (int i=minr, j=minc; i<=maxr && counter<total; i++){
                System.out.println(arr[i][j]);
                counter++;
            }
            minc++;

            //bottom wall
            for (int i=maxr, j=minc; j<=maxc && counter<total; j++){
                System.out.println(arr[i][j]);
                counter++;
            }
            maxr--;
            // left wall
            for (int i=maxr, j=maxc; i>=minr && counter<total; i--){
                System.out.println(arr[i][j]);
                counter++;
            }
            maxc--;
            // top wall
            for (int i=minr, j=maxc; j>=minc && counter<total; j--){
                System.out.println(arr[i][j]);
                counter++;
            }
            minr++;
        }
    }
}