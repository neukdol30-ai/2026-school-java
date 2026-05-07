package Sub13.thread.start;

import Sub13.thread.utils.MyLogger;

public class StartTest01 {
    static void main() {
        Thread thread01 = new Thread(new PrintWork("AAAA",1000));
        Thread thread02 = new Thread(new PrintWork("BBB",500));
        thread01.start();
        thread02.start();
    }

    static class PrintWork implements Runnable{
        private String content;
        private int sleepMilli;

        public PrintWork(String content, int sleepMilli) {
            this.content = content;
            this.sleepMilli = sleepMilli;
        }

        @Override
        public void run() {
            while(true){
                MyLogger.log(content);
                try {
                    Thread.sleep(sleepMilli);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
