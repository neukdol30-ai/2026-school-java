package Sub13.thread.start;

public class ManyThreadMain01 {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread01 = new Thread(helloRunnable);
        thread01.start();
        Thread thread02 = new Thread(helloRunnable);
        thread02.start();
        Thread thread03 = new Thread(helloRunnable);
        thread03.start();
        System.out.println(Thread.currentThread().getName());
    }
}
