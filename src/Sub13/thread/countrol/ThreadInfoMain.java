package Sub13.thread.countrol;


import static Sub13.thread.utils.MyLogger.log;


public class ThreadInfoMain {
    static void main() {

        Thread mainThread = Thread.currentThread();
        log(mainThread);
        log(mainThread.threadId());
        log(mainThread.getName());
        log(mainThread.getPriority());
        log(mainThread.getState());
        log(mainThread.getThreadGroup());
    }
}
