package Sub12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class NewPathMain {
    static void main() throws IOException {
        Path path = Path.of("temp/..");
        System.out.println("path : "+path);
        //1. 절대경로
        System.out.println("absolute path : "+path.toAbsolutePath());
        //2. Canonical Path
        System.out.println("Canonical path : "+path.toRealPath());
        //3. 경로상에 존재하는 모든 것들을 리스트로 반환
        Stream<Path> pathStream = Files.list(path);
        List<Path> list = pathStream.toList();
        pathStream.close();
        for(Path p : list) {
            System.out.println
                    ((Files.isRegularFile(p)?"File":"Directory")+" / "+p.getFileName());
        }
    }
}