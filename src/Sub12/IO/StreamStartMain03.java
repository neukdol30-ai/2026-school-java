package Sub12.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain03 {
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.txt");
        byte [] input = {65,66,67};
        fos.write(input);
        fos.close();
        FileInputStream fis = new FileInputStream("temp/hello.txt");
        byte [] buffer = new byte[10];
        int readCount = fis.read(buffer, 0, 10);
        System.out.println(readCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();
    }
}
