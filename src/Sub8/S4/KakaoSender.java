package Sub8.S4;

public class KakaoSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("카카오 메세지를 발송합니다." + message);
    }
}
