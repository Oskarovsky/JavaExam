package interfaces;

interface IA {

    Integer x = 0;

    static void methodA() {
        Double tester = IB.tester;
        tester = 0d;
        System.out.println("methodA");
    }

    private void helper() {
        System.out.println("invoking helper");
    }

    default int doIt() {
        helper();
        return 33;
    };
} // (1)