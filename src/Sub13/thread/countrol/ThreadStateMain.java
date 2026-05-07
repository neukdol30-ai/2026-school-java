package Sub13.thread.countrol;

import static Sub13.thread.utils.MyLogger.log;


public class ThreadStateMain {
    static void main() throws InterruptedException {

        Thread thread= new Thread(new MyRunnable(), "myThread");

        log(thread.getState());
        thread.start();
        Thread.sleep(1000);
        log(thread.getState());
        Thread.sleep(4000);
        log(thread.getState());

    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            try {
                log("start");
                log(Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log(Thread.currentThread().getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
