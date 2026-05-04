package Sub12.IO.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    static void main() throws IOException {

        FileInputStream fis = new FileInputStream("temp/dog.webp");
        FileOutputStream fos = new FileOutputStream("temp/copy.webp");

        byte[] buffer= new byte[8192];
        //byte[] buffer = fis.readAllBytes();

        int readCount;

        while((readCount = fis.read(buffer)) != -1){
            fos.write(buffer, 0 , readCount);
            //fileoutputStream.write(buffer)
        }

        fis.close();
        fos.close();
    }
}
