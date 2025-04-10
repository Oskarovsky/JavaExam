package slyko.domain.child;

import slyko.domain.BaseOne;

public class SecondOne extends BaseOne {

    private String name;
    private Integer power;

    public SecondOne(Double id, double size, String name, Integer power) {
        super(id, size);
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPower() {
        return this.power;
    }

    public void calcSecond() {
        SecondOne secondOne = new SecondOne(1d, 22d, "", 2);
        System.out.println("Executed from Second One");

        FirstOne firstOne = new FirstOne(22d, 11d);
        firstOne.calcFirst();


        super.calcBase();
    }

    public static void countValue() {
        System.out.println("OK!");
    }
}