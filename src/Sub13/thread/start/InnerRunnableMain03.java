package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class InnerRunnableMain03 {
    static void main() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        //Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() start");

    }
}
