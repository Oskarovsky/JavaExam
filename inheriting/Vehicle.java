package inheriting;

public class Vehicle {

  int numberOfWheels;
  private double power;
  protected int year;

  public Vehicle(int numberOfWheels, double power, int year) {
    this.numberOfWheels = numberOfWheels;
    this.power = power;
    this.year = year;
  }

}
