class FindingProfitLoss {
    int sellingPrice;
    int costPrice;


    
    FindingProfitLoss(int sellingPrice, int costPrice) {
        this.sellingPrice = sellingPrice;
        this.costPrice = costPrice;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and Selling Price is INR " + sellingPrice +
                        "\nThe Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercentage);
    }

    public static void main(String[] args) {
        FindingProfitLoss obj = new FindingProfitLoss(191, 129);
    }
}