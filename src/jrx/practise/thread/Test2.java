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
            },"������lock�������߳�-"+i).start();
        }
        System.out.println(Integer.valueOf(""));

    }
}
