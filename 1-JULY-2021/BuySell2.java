import java.util.*;
public class BuySell2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] prices = new int[n];
        for (int i=0; i<n; i++)
            prices[i] = scn.nextInt();
        
        int sd = 0;
        int bd = 0;
        int profit = 0;
        for (int i=1; i<prices.length; i++){
            if (prices[i] >= prices[i-1])
                sd++;
            else{
                profit += prices[sd] - prices[bd];
                sd=bd=i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
    }
}