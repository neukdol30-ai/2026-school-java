package Sub13.thread.countrol.Join;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;


public class JoinMain03 {
    static void main() throws InterruptedException {
        log("start");
        SumTask sumTask1 = new SumTask(1,50);
        SumTask sumTask2 = new SumTask(51,100);
        Thread thread01 = new Thread(sumTask1);
        Thread thread02 = new Thread(sumTask2);
        thread01.start();
        thread02.start();
        thread01.join();
        thread02.join();
        log(sumTask1.result);
        log(sumTask2.result);
        int sumAll = sumTask1.result+sumTask2.result;
        log(sumAll);
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
