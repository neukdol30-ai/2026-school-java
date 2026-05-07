package Sub13.thread.countrol.interupt;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;

public class ThreadStopMain02 {
    static void main() {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();;
        sleep(4000);
        log("작업 중단 지시 thread.interrupt()");
//        myTask.runFlag=false;
        thread.interrupt();
        log(thread.isInterrupted());
    }
    static class MyTask implements Runnable{
        //boolean runFlag = true;

        @Override
        public void run() {
            try {
                while (true) {
                    log("작업중");
                    Thread.sleep(3000);
                }
            }catch (InterruptedException e){
                log("ERROR : "+Thread.currentThread().isInterrupted());
                log("ERROR : "+e.getMessage());
                log("ERROR : "+Thread.currentThread().getState());
            }
            log("정리");
            log("종료");
        }
    }
}

