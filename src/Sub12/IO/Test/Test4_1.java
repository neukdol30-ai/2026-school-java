package Sub12.IO.Test;

import java.io.*;

public class Test4_1 {
    static void main() throws IOException {

        FileReader fr = new FileReader("temp/input.txt");
        FileWriter fw = new FileWriter("temp/error.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;

        while((line = br.readLine())!=null){

            if(line.contains("ERROR")){
                bw.write(line);
                bw.newLine();
            }

        }

        br.close();
        bw.close();

    }
}
