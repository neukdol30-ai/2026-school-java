package Sub10;

import java.time.ZoneId;

public class ZoneIDTest {
    static void main() {
        for(String availableZoneID : ZoneId.getAvailableZoneIds()){
            ZoneId zoneID = ZoneId.of(availableZoneID);
            System.out.println(zoneID + " / " + zoneID.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println(seoul);
    }
}
