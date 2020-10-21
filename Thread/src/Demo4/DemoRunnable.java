package Demo4;
/*
    创建多线程程序的第二种方式：实现Runnable接口
    java.lang.Runnable
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
    java.lang.Thread
        Thread(Runnable target) 分配新的 Thread 对象。
        Thread(Runnable target, String name) 分配新的 Thread 对象。

    实现步骤：
    1.创建Runnable接口的实现类
    2.在实现类中重写Runnable接口的run方法,设置线程任务
    3.创建Runnable接口的实现类对象
    4.创建Thread类的对象，构造方法中传递接口Runnable的实现类对象
    5.调用Thread类中的start方法，开启新的线程，执行run方法
 */
public class DemoRunnable {
    public static void main(String[] args) {
        DemoRunnableImpl run = new DemoRunnableImpl();
//        Runnable run = new DemoRunnableImpl();  // 多态写法
        Thread t = new Thread(run);
        t.start();
        for(int i = 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName() +"-->"+ i);
        }
    }
}
