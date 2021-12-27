package jrx.practise.thread;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Thread().start();

    }

    public synchronized void aVoid(){
        if (1==1) synchronized (this){

        }
    }
}
