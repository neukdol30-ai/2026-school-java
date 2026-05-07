package Sub13.thread.countrol.interupt;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;

public class ThreadStopMain04 {
    static void main() {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();;
        sleep(100);
        log("작업 중단 지시 thread.interrupt()");
//        myTask.runFlag=false;
        thread.interrupt();
        log(thread.isInterrupted());
    }
    static class MyTask implements Runnable{
        //boolean runFlag = true;

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                log("작업중");
            }
            while (!Thread.interrupted()){
                log("작업중");
            }
            try {
                //while (true) {
                    log("자원정리");
                    Thread.sleep(1000);
                //}
            }catch (InterruptedException e){
//                log("ERROR : "+Thread.currentThread().isInterrupted());
//                log("ERROR : "+e.getMessage());
//                log("ERROR : "+Thread.currentThread().getState());
                log("자원 정리 실패");
                log(Thread.currentThread().isInterrupted());
            }
//            log("정리");
            log("종료");
        }
    }
}

