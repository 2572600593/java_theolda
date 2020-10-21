package Demo5;

import Demo4.DemoRunnableImpl;

/*
    模拟卖票案例
    创建3个线程，同时开启
 */
public class DemoTicket {
    public static void main(String[] args) {
        Runnable run = new RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
    }
}
