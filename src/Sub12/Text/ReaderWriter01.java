package Sub12.Text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderWriter01 {
    static void main() throws IOException {
        String writerString = "ABC";
        byte [] writeBytes = writerString.getBytes(StandardCharsets.UTF_8);
        System.out.println(writerString);
        System.out.println(writeBytes);
        System.out.println(Arrays.toString(writeBytes));
        FileOutputStream fos = new FileOutputStream("temp/hello.txt");
        fos.write(writeBytes);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.txt");
        byte [] readBytes = fis.readAllBytes();
        fis.close();

        String readString = new String(readBytes, StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(writeBytes));
        System.out.println(readString);
    }
}
