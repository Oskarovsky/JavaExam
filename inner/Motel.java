package inner;

class Motel {

    abstract class Kitchen {
        abstract void serveFood();
    }

    interface KitchenInt {
        default void notServe() {
            System.out.println("from interfacde");
        }
    }
}