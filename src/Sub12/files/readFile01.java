package Sub12.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class readFile01 {
    static void main() throws IOException {
        String writeStirng = "abc\n가나다";
        System.out.println();
        System.out.println(writeStirng);

        Path path = Path.of("temp/hello02.txt");
        Files.writeString(path, writeStirng, StandardCharsets.UTF_8);

        String readString = Files.readString(path,StandardCharsets.UTF_8);
        System.out.println();
        System.out.println(readString);

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(int i = 0; i < lines.size(); i++){
            System.out.println(i+1 + ":" +lines.get(i) );
        }


    }
}
