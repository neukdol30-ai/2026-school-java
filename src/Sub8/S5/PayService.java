package Sub8.S5;

public class PayService {
    public void processPay(String option, int amount){
        System.out.println("결제를 시도합니다. : option = " +option+", amonut =" +amount );
        boolean result = false;
        if(option.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        }else{
            System.out.println("결제수단이 없습니다.");
            result = false;
        }
    }
}
