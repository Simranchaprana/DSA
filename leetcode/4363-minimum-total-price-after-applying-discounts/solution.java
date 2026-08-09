import java .util.*;
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
         Arrays.sort(prices);
        Arrays.sort(discounts);
        
     
        double totalSum = 0;
        for (int price : prices) {
            totalSum += price;
        }
        
        int priceIdx = prices.length - 1;
        int discountIdx = discounts.length - 1;
        double maxDiscountAmount = 0;
        
        while (priceIdx >= 0 && discountIdx >= 0) {
            maxDiscountAmount += (double) prices[priceIdx] * discounts[discountIdx] / 100.0;
            priceIdx--;
            discountIdx--;
        }
        
        return totalSum - maxDiscountAmount;
    }
}
