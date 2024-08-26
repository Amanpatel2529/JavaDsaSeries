package ArrayAsignment;

public class StockMaxProfit {

    public static int maxProfit(int prices[]){
        int buy = prices[0]; //means buying price is 7;
        int profit = 0;    //curent profit is zero

        //loop to check todays price of stock
        for(int i =1; i<prices.length; i++){
            //if buy price is less than todays's stock price
            if(buy< prices[i]){
                //profit = todays stock price - buying price,
                profit = Math.max(prices[i] - buy, profit);
            }
            
            else{
                //or buy price is == today's price
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int  prices[] = {7,1,5,3,6,4};  //stock prices

        System.out.println(maxProfit(prices));  //5

    }
}
