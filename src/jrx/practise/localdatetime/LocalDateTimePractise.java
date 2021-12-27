package jrx.practise.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimePractise {
    public static void main(String[] args) {
        new LocalDateTimePractise().test1();

    }

    public void test1(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current Day = "+today);

        LocalDate birthday = LocalDate.of(2018, Month.OCTOBER, 1);
        System.out.println("2018年国庆节:"+birthday);

        LocalDate todayjiangsu = LocalDate.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("Current Day in JiangSu:"+todayjiangsu);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("纪元开始后一年:"+dateFromBase);

        LocalDate day_2021_100 = LocalDate.ofYearDay(2021, 100);
        System.out.println("2021年第100天:"+day_2021_100);
    }
}
