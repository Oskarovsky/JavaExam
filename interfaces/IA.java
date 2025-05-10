package interfaces;

interface IA {

    int x_a = 2;

    default boolean justDoIt(String msg) { return false; } // (1)
    static boolean justDoIt(int i) { return true; } // (2)
} // (1)