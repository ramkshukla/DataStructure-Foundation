import java.util.*;
public class p17{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPath(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPath(int n){
        if (n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if (n<0){
            ArrayList<String> bres  = new ArrayList<>();
            return bres;
        }

        ArrayList<String> Path1 = getStairPath(n-1);
        ArrayList<String> Path2 = getStairPath(n-2);
        ArrayList<String> Path3 = getStairPath(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for (int i=0; i<Path1.size(); i++)
            paths.add("1" + Path1.get(i));
        
        for (int i=0; i<Path2.size(); i++)
            paths.add("2" + Path2.get(i));

        for (int i=0; i<Path3.size(); i++)
            paths.add("3" + Path3.get(i));
        
        return paths;
    }
}