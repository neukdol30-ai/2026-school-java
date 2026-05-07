package Sub12.files.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test8 {
    static void main() throws IOException {

        Path path = Paths.get("C:\\Users\\tjoeunis205\\Downloads");
        LocalDateTime time = LocalDateTime.now().minusDays(7);
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for(Path path1 : stream){
            if(Files.isRegularFile(path1)){
                LocalDateTime time1 = Files.getLastModifiedTime(path1).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                if(time1.isBefore(time)){
                    Files.delete(path);
                    System.out.println(path.getFileName()+"삭제완료");
                }
            }
        }

    }
}
