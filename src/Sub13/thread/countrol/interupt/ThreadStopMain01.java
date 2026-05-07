package Sub13.thread.countrol.interupt;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;

public class ThreadStopMain01 {
    static void main() {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();;
        sleep(4000);
        log("작업 중단 지시 runFlag = false");
        myTask.runFlag=false;
    }
    static class MyTask implements Runnable{
        boolean runFlag = true;

        @Override
        public void run() {
            while (runFlag){
                log("작업중");
                sleep(3000);
            }
            log("정리");
            log("종료");
        }
    }
}

