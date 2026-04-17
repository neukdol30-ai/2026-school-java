package Sub8.S8;

public class S1 {
}

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String toString() {
        return "TV [size=" + size + ", getSize()=" + getSize() + "]";
    }
}

class ColorTV extends TV{

    int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() +"/" +color);
    }
}

class IPTV extends ColorTV{
    String ip;


    public IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    public void printProperty() {
        System.out.println(ip + "/" +getSize() +"/" +color);
    }
}

class TVTest {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
    }
}

class IPTVTest{

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}