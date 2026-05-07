package Sub12.files.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test7 {
    static void main() throws IOException {
        Path path = Paths.get("temp");
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        Path maxFile = null;
        long maxSize = 0;
        for(Path path1 :stream){
            if(Files.isRegularFile(path1)){
                long size = Files.size(path);
                if(size>maxSize){
                    maxSize = size;
                    maxFile = path;
                }
            }
        }
        stream.close();
        System.out.println(maxFile + ":" + maxSize);

    }
}
