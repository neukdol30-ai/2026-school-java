package Sub9.lang;

public class Sub1 {
    static void main() {

        String str = "Java Programming";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        int count = 0;

        String str2 = "banana";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);

        String fileName = "document.pdf";
        int idx = fileName.lastIndexOf(".");
        System.out.println(fileName.substring(idx+1, fileName.length()));

        String fileName2 = "photo.png";
        int idx2 = fileName2.lastIndexOf(".");
        System.out.println(fileName2.substring(0,idx2));
        System.out.println(fileName2.substring(idx2+1, fileName2.length()));

    }
}
