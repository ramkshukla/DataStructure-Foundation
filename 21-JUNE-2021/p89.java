import java.util.*;
public class p89{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(1,1, n, m);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc,int dr, int dc){
        if (sr == dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int ms=1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = getMazePaths(sr, sc+ms, dr, dc);
            for (String hpath : hpaths)
                paths.add("h" + ms + hpath);
        }

        for(int ms=1; ms<=dr-sr; ms++){
           ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
           for(String vpath: vpaths){
               paths.add("v" + ms + vpath);
           }
       }
       for (int ms=1; ms<=dr-sr && ms<=dc-sc; ms++){
           ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
           for (String dpath: dpaths){
               paths.add("d" + ms + dpath);
           }
       }
       return paths;
    }
}