package Sub12.files.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test5 {
    static void main() throws IOException {
        Path path = Paths.get("temp/log.txt");
        List<String> lines = Files.readAllLines(path);
        for(String line:lines) {
            if (line.contains("ERROR")) {
                System.out.println(line);
            }
        }
    }
}
