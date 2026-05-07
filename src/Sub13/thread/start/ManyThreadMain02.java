package Sub13.thread.start;

public class ManyThreadMain02 {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        HelloRunnable helloRunnable = new HelloRunnable();
//        Thread thread01 = new Thread(helloRunnable);
//        thread01.start();
//        Thread thread02 = new Thread(helloRunnable);
//        thread02.start();
//        Thread thread03 = new Thread(helloRunnable);
//        thread03.start();
        for(int i=0; i<100; i++){
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
