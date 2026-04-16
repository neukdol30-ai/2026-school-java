package Sub8.S4;

public class EmailSender implements Sender{

    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다" + message);
    }
}
