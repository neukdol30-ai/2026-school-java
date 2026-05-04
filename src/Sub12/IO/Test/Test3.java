package Sub12.IO.Test;

import java.io.*;

public class Test3 {
    static void main() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("temp/numbers.txt"));

        String line = "";
        int data;
        int sum = 0;

        while ((data = bis.read()) != -1){

            if (data == '\r') continue;

            //if (data == '\n') break;
            if (data == '\n'){
                //System.out.println(line);
                sum = sum + Integer.parseInt(line);
                line = "";
            }else{
                line += (char) data;
            }
        }

        if(!line.equals("")){
            sum = sum + Integer.parseInt(line);
        }

        //System.out.println(line);

        bis.close();

        System.out.println(sum);

        //String line = br.readLine();
        //String line2 = br.readLine();
        //String line3 = br.readLine();
        //String line4 = br.readLine();

        //System.out.println(line);
        //System.out.println(line2);
        //System.out.println(line3);
        //System.out.println(line4);

        //br.close();



    }
}
