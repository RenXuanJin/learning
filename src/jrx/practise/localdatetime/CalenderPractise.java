package jrx.practise.localdatetime;

import java.util.Calendar;

public class CalenderPractise {
    Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        CalenderPractise calenderPractise = new CalenderPractise();
//        calenderPractise.test1();
//        calenderPractise.test2();
//        calenderPractise.test3();
//        calenderPractise.test4();
        calenderPractise.test5();
    }

    public void test1(){
        int year = calendar.get(Calendar.YEAR);

        int month1 = calendar.get(Calendar.MONTH);

        int month2 = calendar.get(Calendar.MONTH)+1;

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        int minute = calendar.get(Calendar.MINUTE);

        int second = calendar.get(Calendar.SECOND);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(
                "???"+year+"?"+month2+"?"
                +day+"?"+hour+"?"+minute+"?"+second+"?"
                +"??"+weekday
        );
    }

    public void test2(){
        calendar.add(Calendar.YEAR,1);

        int year = calendar.get(Calendar.YEAR);

        int month2 = calendar.get(Calendar.MONTH)+1;

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        int minute = calendar.get(Calendar.MINUTE);

        int second = calendar.get(Calendar.SECOND);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(
                "??????"+year+"?"+month2+"?"
                        +day+"?"+hour+"?"+minute+"?"+second+"?"
                        +"??"+weekday
        );
    }

    public void test3(){

        int currentMonth = 6;

        calendar.set(calendar.get(Calendar.YEAR),currentMonth,1);

        calendar.add(Calendar.DATE,-1);

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(
               "6??????"+day
        );
    }

    public void test4(){

        calendar.set(2018,7,8);

        int year = calendar.get(Calendar.YEAR);

        int month = calendar.get(Calendar.MONTH)+1;

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(
                "???"+year+"?"+month+"?"+day+"?"
        );
    }

    public void test5(){

        calendar.set(2018,7,8);

        int year = calendar.get(Calendar.YEAR);

        int month = calendar.get(Calendar.MONTH)+1;

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(
                "set"+year+"年"+month+"月"+day+"日"
        );

        calendar.roll(Calendar.DAY_OF_MONTH,-13);

        int year1 = calendar.get(Calendar.YEAR);

        int month1 = calendar.get(Calendar.MONTH)+1;

        int day1 = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(
                "roll"+year1+"年"+month1+"月"+day1+"日"
        );
    }


}
