package Sub12.files.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test3 {
    static void main() throws IOException {
        Path path = Paths.get("temp");
        Path imageDir = Paths.get("temp/image");
        Files.createDirectories(imageDir);
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for(Path file:stream){
            String filename = file.getFileName().toString();
            if(filename.endsWith(".jpg")){
                Path target = imageDir.resolve(file.getFileName());
                Files.move(file,target);
            }

            stream.close();
        }
    }
}
