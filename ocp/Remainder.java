package ocp;

public class Remainder {

  public static void doIt() {
    int[] nums = {20, 30, 40};
    int sum = 0;
    for (int i : nums)
      sum += i;
    System.out.println(sum);
  }


  public static void main(String[] args) {
    doIt();
  }

}
