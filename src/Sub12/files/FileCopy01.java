package Sub12.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy01 {
    static void main() throws IOException {
        String fileName = "temp/video.mp4";
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream("temp/copy_video.mp4");
        byte [] bytes = fis.readAllBytes();
        fos.write(bytes);
        fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println();


    }
}
