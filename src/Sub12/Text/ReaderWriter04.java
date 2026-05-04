package Sub12.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriter04 {
    static void main() throws IOException {
        String writerString = "ABC\n가나다";
        System.out.println("===write String===");
        System.out.println(writerString);

        FileWriter fileWriter = new FileWriter("temp/hello.txt", StandardCharsets.UTF_8);
        //FileWriter, Reader는 중간에 FileInputStream/FileOutputStream 이 생략된다.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter,1024);
        bufferedWriter.write(writerString);
        bufferedWriter.close(); //  flush() 남아있는 것들 한꺼번에 밀어넣기...

        //파일 읽기
        FileReader fileReader = new FileReader("temp/hello.txt",StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(fileReader,1024);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            stringBuilder.append(line).append("\n");
        }
        bufferedReader.close();
        System.out.println("===read String===");
        System.out.println(stringBuilder);
    }
}
