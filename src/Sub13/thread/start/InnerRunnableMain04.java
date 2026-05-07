package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class InnerRunnableMain04 {
    static void main() {
        MyLogger.log("main() start");
        //Thread thread = new Thread(runnable);
        Thread thread = new Thread(()->MyLogger.log("run()"));
        thread.start();
        MyLogger.log("main() start");

    }
}
