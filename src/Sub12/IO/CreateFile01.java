package Sub12.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile01 {
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream(BufferedConstant.FILE_NAME);
        long startTile = System.currentTimeMillis();
        for(int i =0; i < BufferedConstant.FILE_SIZE;i++){
            fos.write(1);
        }
        fos.close();
        long endTile = System.currentTimeMillis();
        System.out.println(BufferedConstant.FILE_NAME);
        System.out.println(BufferedConstant.FILE_SIZE);
        System.out.println((endTile - startTile));
        
    }
}
