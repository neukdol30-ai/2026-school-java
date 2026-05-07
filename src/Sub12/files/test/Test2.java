package Sub12.files.test;

import java.nio.file.Files;
import java.nio.file.Path;

public class Test2 {
    static void main() {
        Path path = Path.of("temp/photo.jpg");

        String fileName = path.getFileName().toString();

        int dotIndex = fileName.lastIndexOf(".");
        String name = fileName.substring(0, dotIndex);
        String ext = fileName.substring(dotIndex);

        Path savePath = path;
        int count = 1;

        while(Files.exists(savePath)){
            String newFN = name + "(" + count + ")" + ext;
            savePath = path.resolveSibling(newFN);
            count++;
        }

        System.out.println(savePath.getFileName());


    }
}
