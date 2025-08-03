import java.util.*;
class Solution {

    /*
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.maxProfit(prices));

    }

    */


     public int maxProfit(int[] prices){

        int mini = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){

            int currProfit = prices[i] - mini;

            profit = Math.max(currProfit,profit);

            mini = Math.min(mini, prices[i]);
        }

        return profit;
     }


}