package Sub8.S1;

public class downCast {
    static void main() {

        parent p = new Child();   // 업캐스팅
        p.Test();                 // not person

        // p.childOnly();         // 오류, parent 타입이라 안 보임

        Child c = (Child) p;      // 다운캐스팅
        c.childOnly();            // child only
    }

}
