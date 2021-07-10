import java.util.*;
public class p18{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(0, 0, n-1, m-1);
        System.out.println(res);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if (sr  == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> gmp1 = new ArrayList<>();
        ArrayList<String> gmp2 = new ArrayList<>();

        if (sc < dc){
            gmp1 = getMazePaths(sr, sc+1, dr, dc); // h
        }
        if (sr < dr){
            gmp2 = getMazePaths(sr+1, sc, dr, dc); // v
        }
        ArrayList<String> gmp = new ArrayList<>();
        for (int i=0; i<gmp1.size(); i++){
            gmp.add('h' + gmp1.get(i));
        }
        for (int i=0; i<gmp2.size(); i++){
            gmp.add('v' + gmp2.get(i));
        }
        return gmp;
     }
}