package Sub8.S4;

public class sendTest {
    static void main() {

//        Send send = new Send();

//        Sender EmailSender = new EmailSender();
//        send.setSender(EmailSender);
//        send.send();

        Sender [] senders = {new EmailSender(), new SmsSender(), new KakaoSender()};


        for(Sender sender: senders){
            sender.sendMessage("가입을 축하합니다");
        }
    }
}
