package Demo2;

public class DemoGetThreadName {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 调用start，开启新线程，执行run方法
        mt.start();
//        new MyThread().start();
    }
}
