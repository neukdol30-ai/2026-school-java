package Sub13.thread.countrol.sync;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;

public class BankMain {
    static void main() throws InterruptedException {
        //BankAccount bankAccount = new BankAccount01(1000);
        BankAccount bankAccount = new BankAccount02(1000);
        Thread thread01 = new Thread(new WithDrawTask(bankAccount,800),"thread01");
        Thread thread02 = new Thread(new WithDrawTask(bankAccount,800),"thread02");
        thread01.start();
        thread02.start();
        sleep(500);
        log("thread01 state : "+thread01.getState());
        log("thread02 state : "+thread02.getState());

        thread01.join();
        thread02.join();

        log("최종 잔액 : "+bankAccount.getBalance());
    }
}