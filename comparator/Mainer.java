package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainer {

    public static void main(String[] args) {

        final Stock stock1 = new Stock(11.20, "V1", 1);
        final Stock stock2 = new Stock(50, "V2", 4);
        final Stock stock3 = new Stock(12, "V3", 9);
        final Stock stock4 = new Stock(2, "V4", 231);
        final Stock stock5 = new Stock(7, "V5", 43);

        List<Stock> list = Arrays.asList(stock1, stock2, stock3, stock4, stock5);

        list.forEach(t -> System.out.println(t.price * t.quantity));
        Collections.sort(list);
        System.out.println("===");
        list.forEach(t -> System.out.println(t.price * t.quantity));

        System.out.println("=======");
        Comparator<Stock> comparatorByQuantity = Comparator.comparing(Stock::getQuantity).reversed();
        Collections.sort(list, comparatorByQuantity);
        list.forEach(t -> System.out.println(t.quantity));


    }
}
