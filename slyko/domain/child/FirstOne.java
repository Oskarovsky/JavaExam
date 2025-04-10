package slyko.domain.child;

import slyko.domain.BaseOne;


public class FirstOne extends BaseOne {

    static String type = "child";

    public FirstOne(Double id, double size) {
        super(id, size);
    }

    public void calcFirst() {
        System.out.println(String.format("Executed from First One -- %s", size));
    }

}