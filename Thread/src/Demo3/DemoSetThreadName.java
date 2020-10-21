package Demo3;

public class DemoSetThreadName {
    public static void main(String[] args) {
        // 1
        MyThread mt = new MyThread();
        mt.setName("a");
        mt.start();

        // 2
        new MyThread("b").start();  // 在MyThread中加入构造方法后可以直接使用
    }
}
