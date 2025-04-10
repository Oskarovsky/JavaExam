package slyko;

import java.util.*;

public class Scala extends Jvm {

    int test;
    protected int CPU = 4;

    public Scala(String name, int value1, int value2) {
        super(name);
    }

    static void sneeze() {
        System.out.println("Scala");
    }

    public String getSnapshot() {
        return "SCALA-%s.%d".formatted(super.getName(), super.getVersion());
    }
}