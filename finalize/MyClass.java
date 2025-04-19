package finalize;

abstract class MyClass {
    abstract void f();
    final void g() {}
    //final void h() {} // (1)

    protected static int i;
    private int j;

    final void haaa() {}
}