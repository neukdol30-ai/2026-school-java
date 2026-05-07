package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class HelloRunnableMain {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
        //System.out.println(Thread.currentThread().getName());
        MyLogger.log("main() end");
    }
}
