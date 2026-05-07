package Sub13.thread.utils;

public class ThreadUtil {
    public static void sleep(long milli) {
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            MyLogger.log("인터럽트 발생 , "+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
