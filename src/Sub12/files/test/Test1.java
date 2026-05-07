package Sub12.files.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    static void main() throws IOException {
        Path file = Path.of("temp/cat.png");

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String dateName = ldt.format(formatter);

        String fileName = file.getFileName().toString();
        int dotIndex = fileName.lastIndexOf(".");
        String ext = fileName.substring(dotIndex);

        String newFN = dateName + ext;

        Path newPath = file.resolveSibling(newFN);

        Files.move(file, newPath);

        System.out.println(newPath.getFileName());


    }
}
