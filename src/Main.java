import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static void draw(TreeViewer viewer, String name) {
        JFrame frame = new JFrame(name);
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel);
        viewer.setScale(1.5);
        panel.add(viewer);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static String getFIleName() throws IOException {
        System.out.println("Input file name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static TreeViewer buildViewer(String fileName) throws IOException {
        CharStream charStream = CharStreams.fromFileName(fileName);
        MyLexer lexer = new MyLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MyParser parser = new MyParser(tokenStream);
        ParseTree tree = parser.from_file();

        return new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
    }

    public static void main(String[] args) throws Exception {
        TreeViewer viewer = buildViewer(getFIleName());
        draw(viewer, "Tree");
    }

    public static void runFile(String fileName, String name) throws IOException {
        TreeViewer viewer = buildViewer(fileName);
        draw(viewer, name);
    }
}
