package jrx.practise.thread;

import jrx.practise.thread.Myticket;

public class Test1 {
    public static void main(String[] args) {
        Myticket myticket = new Myticket();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    myticket.sale();
                }
            },"消费者线程-"+i).start();
        }

    }
}
