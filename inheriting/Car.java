package inheriting;

public class Car extends Vehicle {

  String model;
  Integer price;

  public Car(int numberOfWheels, double power, int year, String model, Integer price) {
    super(numberOfWheels, power, year);
    this.model = model;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public Integer getPrice() {
    return price;
  }
}
