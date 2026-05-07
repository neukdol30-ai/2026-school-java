package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class InnerRunnableMain02 {
    static void main() {
        MyLogger.log("main() start");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() start");

    }
}
