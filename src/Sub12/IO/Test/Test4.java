package Sub12.IO.Test;

import java.io.*;

public class Test4 {
    static void main() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("temp/input.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("temp/error.txt"));

        String line = "";
        int data;

        while((data = bis.read()) != -1){

            if (data == '\r') continue;

            if(data == '\n'){
                if (line.contains("ERROR")) {
                    bos.write(line.getBytes());
                    bos.write('\n');
                }
                line = "";
            }else{
                line += (char) data;
            }

        }

        if (!line.equals("")) {
            if (line.contains("ERROR")) {
                bos.write(line.getBytes());
                bos.write('\n');
            }
        }

        bis.close();
        bos.close();



    }
}
