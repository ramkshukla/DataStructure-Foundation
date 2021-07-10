import java.util.*;
public class p93{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath(1,1,n,m, "");
    }
    public static void printMazePath(int sr, int sc, int dr, int dc, String psf){
        if (sr>dr || sc>dc)
            return;
        if (sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        printMazePath(sr, sc+1, dr, dc, psf+"h");
        printMazePath(sr+1, sc, dr, dc, psf+"v");
    }
}