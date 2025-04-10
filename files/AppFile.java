package files;

import java.io.IOException;

public class AppFile {
    int count;
    int count2;

    private void print() {
        String x1 = "aaa";
        x1 += "";
        var x2 = "aaa";
        System.out.println(x1 == "aaa");
    }



    public static void main(String[] args) throws IOException {
        AppFile appFile = new AppFile();
        appFile.print();
    }
}
