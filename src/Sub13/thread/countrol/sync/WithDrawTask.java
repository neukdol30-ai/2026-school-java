package Sub13.thread.countrol.sync;

public class WithDrawTask implements Runnable{
    private BankAccount bankAccount;
    private int amount;

    public WithDrawTask(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
