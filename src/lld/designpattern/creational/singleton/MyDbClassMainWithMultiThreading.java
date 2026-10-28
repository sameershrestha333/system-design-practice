package lld.designpattern.creational.singleton;

public class MyDbClassMainWithMultiThreading {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            MyDbClass.getInstance_synchronizedKeyword();
        };


        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);
        thread1.start();
        thread2.start();
    }
}
