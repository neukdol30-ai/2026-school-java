package Sub12.files;

import java.io.File;
import java.io.IOException;

public class OldFileMain {
    static void main() throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");
        System.out.println(file.exists());
        System.out.println(directory.exists());

        boolean created = file.createNewFile();
        System.out.println(created);
        boolean dirCreated = directory.createNewFile();
        System.out.println(dirCreated);

        //boolean deleted = file.delete();
        //System.out.println(deleted);
        //boolean dirDeleted = directory.delete();
        //System.out.println(dirDeleted);

        System.out.println(file.isFile());

        System.out.println(directory.isDirectory());

        System.out.println(file.getName());

        File img = new File("temp/copy.jpg");
        System.out.println(img.length());

        File newFile = new File("temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println(renamed);



    }
}
