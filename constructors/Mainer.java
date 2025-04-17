package constructors;

public class Mainer {

  public static void main(String[] args) {

    Child child = new Child();
    Parent parent =child;

    System.out.println("|" + parent.getModelName() + "|" + child.getModelName() +
        "|" + parent.getRegNo()
        + "|" + child.getRegNo() + "|");


  }

}
