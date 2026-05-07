package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class InnerRunnableMain01 {
    static void main() {
        MyLogger.log("main() start");
        Runnable runnable = new MaRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() start");

    }

    static class MaRunnable implements Runnable {


        @Override
        public void run() {
            MyLogger.log("run()");
        }
    }
}
