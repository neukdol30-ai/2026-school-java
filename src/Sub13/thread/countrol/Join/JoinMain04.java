package Sub13.thread.countrol.Join;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;


public class JoinMain04 {
    static void main() throws InterruptedException {
        log("start");
        SumTask sumTask01 = new SumTask(1,50);
        Thread thread01 = new Thread(sumTask01);
        thread01.start();
        log("join() - main thread 가 thread01 종료까지 1초 대기"); //WAITING
        thread01.join(1000);
        log("main thread 대기가 끝남");
        log("sumTask01.result = "+sumTask01.result); //1000
        log("end");
    }
    static class SumTask implements Runnable{
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++){
                sum+=i;
            }
            result = sum;
            log(result);
        }
    }
}
