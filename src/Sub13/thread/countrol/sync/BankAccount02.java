package Sub13.thread.countrol.sync;

import static Sub13.thread.utils.MyLogger.log;
import static Sub13.thread.utils.ThreadUtil.sleep;

public class BankAccount02 implements BankAccount{
    volatile  private  int balance;

    public BankAccount02(int balance) {
        this.balance = balance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {
        log(getClass().getSimpleName());
        log(amount +"/"+ balance);
        if(balance < amount){
            log("실패");
            return false;
        }
        log("검증완료");
        sleep(1000);
        balance-=amount;
        log("출금완료" + amount + "/" + balance);
        log("거래종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
