package Sub12.files.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test4 {
    static void main() throws IOException {
        Path path = Paths.get("temp/memo.txt");
        List<String> lines = Files.readAllLines(path);
        for(int i=0; i<lines.size(); i++){
            System.out.println(lines.get(i));
        }
    }
}
