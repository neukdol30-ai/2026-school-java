package Sub12.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain01 {
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.txt");
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();
        FileInputStream fis = new FileInputStream("temp/hello.txt");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        fis.close();
    }
}
