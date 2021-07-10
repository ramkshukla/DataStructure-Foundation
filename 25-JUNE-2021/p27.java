import java.util.*;
public class p27{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m ;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfills(arr, 0, 0, "", visited);

    }
    public static void floodfills(int[][] maze, int row, int col, String asf, boolean[][] visited){
        if (row<0 || col<0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        if (row == maze.length-1 && col == maze[0].length - 1){
            System.out.println(asf);
            return;
        }
        visited[row][col] = true;
        floodfills(maze, row-1, col, asf+"t", visited);
        floodfills(maze, row, col-1, asf+"l", visited);
        floodfills(maze, row+1, col, asf+"d", visited);
        floodfills(maze, row, col+1, asf+"r", visited);
        visited[row][col] = false;
    }
}