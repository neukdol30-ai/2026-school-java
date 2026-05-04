package Sub12.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriter02 {
    static void main() throws IOException {
            String writerString = "abc";
            System.out.println("write String : "+writerString);

            // Reader/Writer

            FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            outputStreamWriter.write(writerString);
            outputStreamWriter.close(); //  flush() 남아있는 것들 한꺼번에 밀어넣기...

            //파일 읽기
            FileInputStream fileInputStream = new FileInputStream("temp/hello.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,StandardCharsets.UTF_8);
            StringBuilder stringBuilder = new StringBuilder();
            int ch;
            while ((ch=inputStreamReader.read())!=-1) {
                stringBuilder.append((char)ch);
            }
            inputStreamReader.close();
            System.out.println("read String : "+stringBuilder);
    }
}
