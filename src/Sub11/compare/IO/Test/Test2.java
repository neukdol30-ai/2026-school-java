package Sub11.compare.IO.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("temp/diary.txt");


        while(true){
            String input = sc.nextLine();
            if(input.equals("exit")) break;

            String line = input + "\n";
            fos.write(line.getBytes());
        }

        fos.close();
        sc.close();




    }
}
