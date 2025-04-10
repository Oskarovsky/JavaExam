package slyko.domain;

public class BaseOne {

    Double id;
    protected Double size;

    public BaseOne(Double id, double size) {
        this.id = id;
        this.size = size;
    }

    public Double getId() {
        return this.id;
    }

    protected void calcBase() {
        System.out.println("Executed from Base One");
    }
}