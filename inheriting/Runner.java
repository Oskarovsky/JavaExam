package inheriting;

public class Runner {

  public static void main(String[] args) {

    Car car = new Car(4, 230d, 2022, "Toyota", 32000);

    Vehicle vehicle = new Car(4, 230d, 2022, "Toyota", 32000);



    System.out.println(car.numberOfWheels);
    System.out.println(car.price);
    System.out.println(car.price);
    System.out.println(car.model);
    System.out.println(car.year);

  }

}
