package finalize;

class Stock {
    double price;
    int quantity;

    public Stock(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public final double estimateValue() {
        return quantity * price;
    }
}
