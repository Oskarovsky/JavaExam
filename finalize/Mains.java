package finalize;

public class Mains {

    public static void main(String[] args) {

        RegisteredStock registeredStock = new RegisteredStock(22.30, 3, "David");

        System.out.println("Verify name: %b".formatted(registeredStock.verifyName("David")));
        System.out.println(registeredStock.estimateValue());
    }
}
