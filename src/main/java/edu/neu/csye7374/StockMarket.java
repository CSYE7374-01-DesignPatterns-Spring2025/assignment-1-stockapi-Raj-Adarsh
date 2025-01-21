package edu.neu.csye7374;

public class StockMarket {
    public static void demo() {
        Stock stock1 = new StockSubclass1("TESLA", 422.07, "Tesla Common Stock");
        Stock stock2 = new StockSubclass2("APPLE", 170.20, "Apple Inc. Common Stock");

        for (int i = 1; i <= 6; i++) {
            stock1.setBid(450 + (i * (-2.5)));
            stock2.setBid(179 + (i * 2.5));

            System.out.println(stock1);
            System.out.println("Stock 1 Metric: " + stock1.getMetric());

            System.out.println(stock2);
            System.out.println("Stock 2 Metric: " + stock2.getMetric());
        }
    }
}