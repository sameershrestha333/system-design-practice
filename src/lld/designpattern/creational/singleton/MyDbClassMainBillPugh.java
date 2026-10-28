package lld.designpattern.creational.singleton;

public class MyDbClassMainBillPugh {
    public static void main(String[] args) {
        MyDbClass_Bill_Pugh myDbClass1 = MyDbClass_Bill_Pugh.getInstance();
        MyDbClass_Bill_Pugh myDbClass2 = MyDbClass_Bill_Pugh.getInstance();

        System.out.println(myDbClass1);
        System.out.println(myDbClass2);
        System.out.println(myDbClass1 == myDbClass2);
    }
}
