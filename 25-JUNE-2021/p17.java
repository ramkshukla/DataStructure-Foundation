import java.util.*;
public class p17{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n){
        if (n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if (n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
                ArrayList<String> path2 = getStairPaths(n-2);
                        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        for (int i=0; i<path1.size(); i++){
            paths.add('1' + path1.get(i));
        } 
        for (int i=0; i<path2.size(); i++){
            paths.add('2' + path2.get(i));
        } 
        for (int i=0; i<path3.size(); i++){
            paths.add('3' + path3.get(i));
        } 
        return paths;
    }
}