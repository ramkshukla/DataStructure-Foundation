import java.util.*;
public class p45{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++)
            arr1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2; i++)
            arr2[i] = scn.nextInt();
        
        int n3 = Math.max(n1, n2) + 1;
        int[] res = new int[n3];

        int i = n1-1;
        int j = n2-1;
        int k = n3-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
            int sum = carry;
            if (i>=0)
                sum+=arr1[i];
            if (j>=0)
                sum+=arr2[j];
            int q = sum/10;
            int r = sum%10;

            res[k] = r;
            i--;
            j--;
            k--;
        }
        if (res[0]!=0)
            System.out.println(res[0]);
        for (i=1; i<res.length; i++)    
            System.out.println(res[i]);


    }
}