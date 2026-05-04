package Sub12.Text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderWriter03 {
    static void main() throws IOException {
        String writerString = "ABC";
        System.out.println("write String : "+writerString);

        FileWriter fileWriter = new FileWriter("temp/hello.txt", StandardCharsets.UTF_8);
        //FileWriter, Reader는 중간에 FileInputStream/FileOutputStream 이 생략된다.
        fileWriter.write(writerString);
        fileWriter.close(); //  flush() 남아있는 것들 한꺼번에 밀어넣기...

        //파일 읽기
        FileReader fileReader = new FileReader("temp/hello.txt", StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while ((ch=fileReader.read())!=-1) {
            stringBuilder.append((char)ch);
        }
        fileReader.close();
        System.out.println("read String : "+stringBuilder);
    }
}
