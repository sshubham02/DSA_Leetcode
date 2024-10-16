package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Buy_And_Sell_Problem {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,5,3,1,2,8);
        //List<Integer> arr = Arrays.asList(7,1,5,3,6,4);
        System.out.println("max profit is : "+max_profit_caseI(arr));
        System.out.println("max profit optimal solution is : "+optimal_max_profit_caseI(arr));
        System.out.println("max profit Case II optimal solution is : "+optimal_max_profit_caseII(arr));
    }

    /**
     * In this case buy and sell is allowed only once's.
     * So need to pick only one combination of when to buy and when to sell
     * @return int
     */
    private static int max_profit_caseI(List<Integer> prices){
        int res=0;
        for(int i=0;i<prices.size();i++){
            int ele = prices.get(i);
            for(int j=i+1;j<prices.size();j++){
                int diff = prices.get(j)-ele;
                if(diff>res){
                    res = diff;
                }
            }
        }
        return res;
    }

    /**
     * Optimal solution for caseI
     * In this case buy and sell is allowed only once's.
     * So need to pick only one combination of when to buy and when to sell
     * @return int
     */
    private static int optimal_max_profit_caseI(List<Integer> prices){
        int profit=0;int min=prices.get(0);

        for(int i=1;i<prices.size();i++){
            int cost = prices.get(i) - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices.get(i));
        }
        return profit;
    }

    /**
     * Optimal solution for caseII
     * In this case buy and sell is allowed n number of times.
     * So need to pick only one combination of when to buy and when to sell to maximise profit
     * @return int
     */
    private static int optimal_max_profit_caseII(List<Integer> prices){
        int profit=0;

        for(int i=1;i<prices.size();i++){
            if(prices.get(i)>prices.get(i-1)){
                profit+=(prices.get(i)-prices.get(i-1));
            }
        }
        return profit;
    }

}
