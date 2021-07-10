import java.util.*;
public class p24{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath(1,1,n,m,"");
    }
    public static void printMazePath(int sr, int sc, int dr, int dc, String asf){
        if (sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        for (int ms=1; ms<=dc-sc; ms++){
            printMazePath(sr, sc+ms, dr, dc, asf+"h"+ms);
        }
        for (int ms=1; ms<=dr-sr; ms++){
            printMazePath(sr+ms, sc, dr, dc, asf+"v"+ms);
        }
        for (int ms=1; ms<=dc-sc && ms<=dr-sr; ms++){
            printMazePath(sr+ms, sc+ms, dr, dc, asf+"d"+ms);
        }
    }
}