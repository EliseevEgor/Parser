import java.io.IOException;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Input num");
            Scanner myInput = new Scanner(System.in);
            int i = myInput.nextInt();
            switch (i) {
                case 1:
                    testSimple();
                    break;
                case 2:
                    testFor();
                    break;
                case 3:
                    testWhile();
                    break;
                case 4:
                    testIf();
                    break;
                case 5:
                    testComplexWile();
                    break;
                case 6:
                    testFuc();
                    break;
                case 7:
                    testError();
                    break;
            }
        }
    }

    private static void testSimple() throws IOException {
        Main.runFile("./src/examples/simple", "Simple");
    }

    private static void testFor() throws IOException {
        Main.runFile("./src/examples/for", "for");
    }

    private static void testWhile() throws IOException {
        Main.runFile("./src/examples/while", "while");
    }

    private static void testIf() throws IOException {
        Main.runFile("./src/examples/if", "if");
    }

    private static void testComplexWile() throws IOException {
        Main.runFile("./src/examples/complex while", "Complex while");
    }

    private static void testFuc() throws IOException {
        Main.runFile("./src/examples/func", "fun");
    }

    private static void testError() throws IOException {
        Main.runFile("./src/examples/error", "Error");
    }
}
