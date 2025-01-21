package edu.neu.csye7374;

public class StockSubclass1 extends Stock {
    public StockSubclass1(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        double performanceIndex = calulatePerformanceIndex();

        if ( performanceIndex > 0 ) {
            return (int) performanceIndex;
        }
        else {
            return (int) performanceIndex;
        }
    }

    private double calulatePerformanceIndex() {
        if (bidIndex < 1) {
            return 0;
        }

        double initialTradedPrice = bids[0];
        double lastTradedPrice = bids[bidIndex - 1];
        double priceChangePercentage = ((lastTradedPrice - initialTradedPrice) / initialTradedPrice) * 100;

        return priceChangePercentage;
    }
}
