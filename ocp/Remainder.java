package ocp;

public class Remainder {

  static void testSwitch(Integer x) {
    switch (x) {
//      case 1:
//        System.out.println("1");
//      case 2:
//        System.out.println("2");
//      default:
//        System.out.println("1111");
    }
  }

  public static void main(String[] args) {

    var x = 1;
    var a = 1000;
    var result = switch (x) {
      case 1, 4, 5: {
        yield a++;
      }
      case 2: yield 20;
      case 3: yield 30;
      default: throw new IllegalStateException("Unexpected value: " + x);
    };

    System.out.println(result);
    System.out.println(a);
  }

}
