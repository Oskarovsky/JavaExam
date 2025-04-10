package records;

import java.util.*;

public final record Ticket(int id, String name, double price) {

    public Ticket(int id, String name, double price) {
        if (price < 0) throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
        this.price = price;
    }


}