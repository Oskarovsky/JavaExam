package finalize;

public class MyOtherClass extends MyClass {

    //MyOtherClass(int n) { m = n; }

    public static void main(String[] args) {
        MyClass mc = new MyOtherClass();
    }

    @Override
    void f() {}

    void h() {}
    void k() { i++; }
    int m;
}
