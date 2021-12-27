package jrx.practise.localdatetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoLocalDate {
    public static void main(String[] args) {
        // 当前日期：2019-10-16
        LocalDate today = LocalDate.now();

        // 获取localDate对象
        LocalDate date2 = LocalDate.of(2019, 10, 16);

        today = date2;
        LocalDate date3 = LocalDate.parse("2019-9-10");

        // 当前日期年份：2019
        System.out.println(today.getYear());

        // 当前日期月份对象：OCTOBER
        System.out.println(today.getMonth());

        // 当前日期月份：10
        System.out.println(today.getMonthValue());

        // 该日期是当前周的第几天:3
        System.out.println(today.getDayOfWeek().getValue());

        // 该日期是当前月的第几天:16
        System.out.println(today.getDayOfMonth());

        // 该日期是当前年的第几天:289
        System.out.println(today.getDayOfYear());

        // 修改该日期的年份：2022-10-16
        System.out.println(today.withYear(2022));

        // 修改该日期的月份：2019-12-16
        System.out.println(today.withMonth(12));

        // 修改该日期在当月的天数：2019-10-01
        System.out.println(today.withDayOfMonth(1));

        // 判断是否是闰年：false
        System.out.println(today.isLeapYear());

        // 当前年份有多少天：365
        System.out.println(today.lengthOfYear());

        // 当前月份有多少天：31
        System.out.println(today.lengthOfMonth());

        // 比较该日期与other日期的大小，返回正数，那么当前对象时间较晚（数字较大）:15
        int i = today.compareTo(LocalDate.of(2019, 10, 1));
        System.out.println(i);

        // 比较该日期是否比参数日期早（true为早）:true
        System.out.println(today.isBefore(LocalDate.of(2019,10,18)));

        // 比较该日期是否比参数日期晚（true为晚）:false
        System.out.println(today.isAfter(LocalDate.of(2019,10,18)));

        // 比较两个日期是否相等:true
        System.out.println(today.isEqual(LocalDate.now()));

        // 当前日期增加指定的年数:2020-10-16
        System.out.println(today.plusYears(1));

        // 当前日期增加指定的月份:2019-12-16
        System.out.println(today.plusMonths(2));

        // 当前日期增加指定的周数:2019-10-30
        System.out.println(today.plusWeeks(2));

        // 当前日期增加指定的天数:2019-10-23
        System.out.println(today.plusDays(7));

        // 当前日期减少指定的年数:2018-10-16
        System.out.println(today.minusYears(1));

        // 当前日期减少指定的月份:2019-06-16
        System.out.println(today.minusMonths(4));

        // 当前日期减少指定的周数:2019-10-09
        System.out.println(today.minusWeeks(1));

        //  当前日期减少指定的天数:2019-10-01
        System.out.println(today.minusDays(15));

        //LocalDate 转 String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = today.format(dateTimeFormatter);
        System.out.println(dateString);

        // String 转 LocalDate
        String str = "2010-10-01";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(str, fmt);
        System.out.println(date);

        //Date 转 LocalDate
        Date now = new Date();

        // 先将java.util.Date转换为ZonedDateTime
        Instant instant = now.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        // 使用它的toLocalDate（）方法从ZonedDateTime获取LocalDate。
        LocalDate localDate = zonedDateTime.toLocalDate();
        System.out.println(localDate);

        // Wed Oct 16 15:26:41 CST 2019
        System.out.println(now);

        //2019-10-16
        System.out.println(localDate);

        // LocalDate 转 Date
        ZoneId id = ZoneId.systemDefault();
        LocalDate now1 = LocalDate.now();
        ZonedDateTime dateTime = now1.atStartOfDay(id);
        Date date1 = Date.from(dateTime.toInstant());
        System.out.println(date1);

    }
}
