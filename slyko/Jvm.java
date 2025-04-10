package slyko;

import java.util.*;
import java.time.*;
import java.util.stream.Stream;

import slyko.domain.child.SecondOne;
import slyko.domain.child.FirstOne;


public class Jvm extends Machine {

    private int version;
    private String name;

    public Jvm() {
        new Jvm("ss");
        version = 2;
        name = "ss";
    }

    public Jvm(String name) {
        this.name = name;
        this.version = 22;
    }

    void printMachineDetails() { }

    final static void testModifiers() {

    }

    static void sneeze() {
        System.out.println("JVM");
    }

    public String getSnapshot() {
        return "JVM-%s.%d".formatted(getName(), getVersion());
    } 

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version; 
    }

    public void setVersion(int version) {
        this.version = version;
    }
}


