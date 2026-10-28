package lld.designpattern.creational.singleton;

public class MyDbClassMainNormal {
    public static void main(String[] args) {
        MyDbClass myDbClass1 = MyDbClass.getInstance_normal_thread_unsafe();
        MyDbClass myDbClass2 = MyDbClass.getInstance_normal_thread_unsafe();

        System.out.println(myDbClass1);
        System.out.println(myDbClass2);
        System.out.println(myDbClass1 == myDbClass2);
    }
}
