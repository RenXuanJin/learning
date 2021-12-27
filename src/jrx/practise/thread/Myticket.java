package jrx.practise.thread;

public class Myticket {

    public static int getNum() {
        return num;
    }

    public synchronized void sale(){
        num--;
        System.out.println(Thread.currentThread().getName()+"卖出一张票,剩余票数"+num);
    }

    public static void setNum(int num) {
        Myticket.num = num;
    }

    public static int num = 10;

}
