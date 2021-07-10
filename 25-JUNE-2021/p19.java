import java.util.*;
public class p19{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if (sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        // horizontal row
        for (int ms=1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = getMazePaths(sr, sc+ms, dr, dc);
            for (String rstr : hpaths)
                paths.add("h" + ms + rstr);
        }

        // vertical column
        for (int ms =1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
            for (String rstr: vpaths)
                paths.add("v" + ms+ rstr);
        }

        for (int ms=1; ms<=dc-sc && ms<=dr-sr; ms++){
            ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
            for (String rstr: dpaths)
                paths.add("d" + ms + rstr);
        }
        return paths;
    }
}