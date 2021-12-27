package jrx.practise.localdatetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimePractise {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current time = "+now);

        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println(specificTime);

        LocalTime timeSH = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(timeSH);

        LocalTime second = LocalTime.ofSecondOfDay(10000);
        System.out.println(second);
    }
}
