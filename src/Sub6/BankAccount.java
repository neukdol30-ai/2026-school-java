package Sub6;

public class BankAccount {
    String owner;
    int balance;

    void deposit(int money){
        if(money <= 0){
            System.out.println("0원 이하의 금액은 입금할 수 없습니다.");
            return;
        }
        balance += money;
    }
    void withdraw(int money){

        if(money <= 0){
            System.out.println("0원 이하의 금액은 출금할 수 없습니다.");
            return;
        }
        if(balance >= money){
            balance = balance - money;
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
    void showBalance(){
        System.out.println(balance);
    }
}
