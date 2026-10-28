package lld.designpattern.creational.singleton;

public class MyDbClass {
    private static volatile MyDbClass INSTANCE = null;

    private MyDbClass() {
        System.out.println("Object Created");
    }

    public static MyDbClass getInstance_normal_thread_unsafe() {
        if (INSTANCE == null) {
            INSTANCE = new MyDbClass();
        }
        return INSTANCE;

    }

    public synchronized static MyDbClass getInstance_synchronized() {
        if (INSTANCE == null) {
            INSTANCE = new MyDbClass();
        }
        return INSTANCE;
    }

    public static MyDbClass getInstance_synchronizedKeyword() {
        if (INSTANCE == null) {

            synchronized (MyDbClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MyDbClass();
                }
            }
        }
        return INSTANCE;
    }
}
