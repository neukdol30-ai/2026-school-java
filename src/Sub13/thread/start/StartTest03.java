package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class StartTest03 {
    static void main() {

        Thread countThread = new Thread(new CountRunnable(), "counter");
        countThread.start();

    }

    static class CountRunnable implements Runnable{
        @Override
        public void run() {
            for(int i= 1; i<=5;i++){
                MyLogger.log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
