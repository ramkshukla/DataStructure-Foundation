import java.util.*;
public class p86{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList <String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str){
        if (str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String rss = str.substring(1);
        ArrayList<String> fres = gss(rss);
        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : fres){
            mres.add("" + rstr);
        }
        for(String rstr : fres){
            mres.add(ch + rstr);
        }
        return mres;
    }
}