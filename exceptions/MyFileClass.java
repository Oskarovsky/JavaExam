package exceptions;

public class MyFileClass implements AutoCloseable {

    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() throws IllegalStateException{
        throw new IllegalStateException("File handler not implemented yet.");
    }

    public static void main(String[] args) {
        try (MyFileClass file = new MyFileClass(1)) {
//            System.out.println("Add new file 1!");
            throw new IllegalStateException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println(throwable.getMessage());
            }
        }
    }
}
