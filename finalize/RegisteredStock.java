package finalize;

public final class RegisteredStock extends Stock {

    private String TEMP_VALUE;

    private String name;

    {
        TEMP_VALUE = "";
    }

    public RegisteredStock(double price, int quantity, String name) {
        super(price, quantity);
//        TEMP_VALUE = "22";
        this.name = name;
    }

    public boolean verifyName(String name) {
        System.out.println(TEMP_VALUE);
        return name.equals(this.name);
    }
}
