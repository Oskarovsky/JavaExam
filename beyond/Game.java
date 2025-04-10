package beyond;

import java.util.*;

public abstract interface Game {

    static void runGame() {
        System.out.println("Game is running!");
    }

    default double countHealth() {
        return 100.00;
    }

    void attack(int power);

}