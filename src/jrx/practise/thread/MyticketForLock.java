package jrx.practise.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyticketForLock {

    public static int getNum() {
        return num;
    }

    Lock MyticketLock = new ReentrantLock();

    public  void sale(){
        System.out.println(Thread.currentThread().getName()+"手动上锁");
        MyticketLock.lock();
        try{
            num--;
            System.out.println(Thread.currentThread().getName()+"卖出一张票,剩余票数"+num);
        }finally {
            System.out.println(Thread.currentThread().getName()+"手动解锁");
            MyticketLock.unlock();
        }

    }

    public static void setNum(int num) {
        MyticketForLock.num = num;
    }

    public static int num = 10;

}
