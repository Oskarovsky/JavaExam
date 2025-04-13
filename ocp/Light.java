package ocp;

public class Light {

  String title;

  boolean b;
  int i;
  Object o;

  public static int counter;

  int getCounter() {
    if (b=true){
      counter++;
    }

    return counter;
  }

  static void modifyStaticCounter() {
    int[] ia = new int[1];
    ia[0]++;
    counter++;
  }

  void modifyCounter() {
    var x = 2;
    Light light = new Light();
    light.counter++;
  }
}
