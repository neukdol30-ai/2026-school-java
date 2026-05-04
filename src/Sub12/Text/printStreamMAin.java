package Sub12.Text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStreamMAin {
    static void main() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp/print.txt");
        PrintStream ps = new PrintStream(fos);
        ps.println("hello java");
        ps.println(10);
        ps.println(true);
        ps.println("hello world");
        ps.close();
    }
}
