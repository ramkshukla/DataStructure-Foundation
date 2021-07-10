import java.io.*;
import java.util.*;

public class p49{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int pos;
    int[] inv = new int[a.length];
    for (int i=0; i<a.length; i++){
        pos = a[i];
        inv[pos] = i;
    }
       
    return inv;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}