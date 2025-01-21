package edu.neu.csye7374;

public class Stock implements Tradable {
    private String ID;
    protected double price;
    private String description;
    protected double[] bids;
    protected int bidIndex;


    public Stock(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
        this.bids = new double[6];
        this.bidIndex = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double[] getBids() {
        return bids;
    }

    public void setBids(double[] bids) {
        this.bids = bids;
    }

    public int getBidIndex() {
        return bidIndex;
    }

    public void setBidIndex(int bidIndex) {
        this.bidIndex = bidIndex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void setBid(double bid) {
        if (bidIndex < 6) {
            bids[bidIndex++] = bid;
            calculateStockPrice();
        }
        else {
            System.out.println("Bid not added. Stock is full.");
        }
    }


    private void calculateStockPrice() {
        double total = 0;
        for (int i = 0; i < bidIndex; i++) {
            total += bids[i];
        }
        price = total / bidIndex;
    }

    @Override
    public int getMetric() {
        return (int) price > 100 ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Stock ID: " + ID + "\nDescription: " + description + "\nPrice: " + price;
    }
}