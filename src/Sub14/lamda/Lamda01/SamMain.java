package Sub14.lamda.Lamda01;

public class SamMain {
    static void main() {
        SamInterface samInterface = new SamInterface() {
            @Override
            public void run() {
                System.out.println("SAM");
            }
        };

        SamInterface samInterface01 = () -> {
            System.out.println("SAM02");
        };
        samInterface.run();
        samInterface01.run();
    }
}
