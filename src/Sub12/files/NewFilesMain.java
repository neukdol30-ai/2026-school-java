package Sub12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {
    static void main() throws IOException {
        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");
        //1. 파일이나 디렉토리 존재 여부
        System.out.println("File exists : "+ Files.exists(file));
        //2. 파일을 생성
        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println(file+" File already exists");
        }
        //4. 파일 삭제
        //Files.delete(file);
        //System.out.println("File deleted");

        //5. isRegularFile()  파일인지 아닌지...
        System.out.println("Is Regular File : "+Files.isRegularFile(file));

        //6. isDirectory()  파일인지 아닌지...
        System.out.println("Is Directory : "+Files.isDirectory(directory));

        //7. getName()  이름 반환...
        System.out.println("File name : "+file.getFileName());

        //8. size()  크기 반환...
        System.out.println("File size : "+Files.size(file)+"byte");

        //9. move() 파일의 이름을 변경하거나 이동
        Path newFile = Paths.get("temp/newFile.txt");
        Files.move(file,newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved/renamed");

        //10. getLastModifiedTime();  마지막 수정된 시간 반환
        System.out.println("last Modified Time : "+Files.getLastModifiedTime(newFile));

        //11. 전부 다  출력
        BasicFileAttributes attributes = Files.readAttributes(newFile, BasicFileAttributes.class);
        System.out.println("=============Attributes=============");
        System.out.println("Creation Time : "+attributes.creationTime());
        System.out.println("is directory : "+attributes.isDirectory());
        System.out.println("is regular file : "+attributes.isRegularFile());
        System.out.println("symbolic link : "+attributes.isSymbolicLink());
        System.out.println("size : "+attributes.size());

    }
}
