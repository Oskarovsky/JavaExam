package finalize;

public class Lab {
    public static void main(String[] args) {
        LivingOrganism org = new Bacteria();
        org.feed();
        ((Bacteria)org).feed(10);
    }
}