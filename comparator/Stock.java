package comparator;

public class Stock implements Comparable<Stock>{

    double price;
    String name;
    int quantity;

    public Stock(double price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Stock o) {
        return Double.compare(this.quantity * this.price, o.quantity * o.price);
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
