import java.io.*;
import java.util.*;

public class p88 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n==0){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if (n<0){
            ArrayList <String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList <String> paths1 = getStairPaths(n-1);
        ArrayList <String> paths2 = getStairPaths(n-2);
        ArrayList <String> paths3 = getStairPaths(n-3);
        
        
        ArrayList <String> paths = new ArrayList<>();
        
        for (int i=0; i<paths1.size(); i++){
            paths.add("1" + paths1.get(i));
        }
        for (int i=0; i<paths2.size(); i++){
            paths.add("2" + paths2.get(i));
        }
        for (int i=0; i<paths3.size(); i++){
            paths.add("3" + paths3.get(i));
        }
        return paths;
    }

}