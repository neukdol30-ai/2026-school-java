package Sub12.IO.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test5 {
    static void main() throws IOException {

        FileWriter fw = new FileWriter("temp/log.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        bw.write(ldt.format(dtf));
        bw.newLine();
        bw.close();
        System.out.println("로그 저장");


    }
}
