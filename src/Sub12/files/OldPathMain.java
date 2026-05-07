package Sub12.files;

import java.io.File;
import java.io.IOException;

public class OldPathMain {
    static void main() throws IOException {
        File file = new File("temp/..");
        System.out.println("path = "+file.getPath());
        //1. 절대경로
        System.out.println("absolute path = "+file.getAbsolutePath());
        //2. 정규경로
        System.out.println("Canonical path = "+file.getCanonicalPath());
        //3. 경로상에 존재하는 모든 것들을 배열로 반환
        File [] files = file.listFiles();
        for(File f:files) {
            System.out.println((f.isFile()?"File":"Directory")+" / "+f.getName());
        }
    }
}