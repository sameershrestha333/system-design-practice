package lld.designpattern.creational.singleton;

// Singleton — provides one shared instance
public class MyDbClass_Bill_Pugh {

    private MyDbClass_Bill_Pugh() {
        System.out.println("Object Created");
    }

    // Initialization holder — lazily initializes the shared instance
    private static class Holder {
        private static final MyDbClass_Bill_Pugh INSTANCE = new MyDbClass_Bill_Pugh();
    }

    public static MyDbClass_Bill_Pugh getInstance() {
        return Holder.INSTANCE;

    }


}
