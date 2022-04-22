package jrx.practise.thread;

public class Test2 {
    public static void main(String[] args) {
        MyticketForLock myticket = new MyticketForLock();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    myticket.sale();
                }
            },"消费者lock锁测试线程-"+i).start();
        }
        System.out.println(Integer.valueOf(""));

    }
}
