package Sub12.files.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test6 {
    static void main() throws IOException {
        Path path = Paths.get("temp/images");
        int count = 0;
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for(Path path1 :stream){
            if(Files.isRegularFile(path1)){
                String name = path1.getFileName().toString().toLowerCase();
                if(name.endsWith(".jpg")||name.endsWith(".png")||name.endsWith(".gif")){
                    count++;
                }
            }
        }
        stream.close();
        System.out.println(count);

    }
}
