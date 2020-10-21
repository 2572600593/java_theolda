package Demo5;

// 实现卖票案例
public class RunnableImpl implements  Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;

    // 创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            // 同步代码块
            synchronized(obj) {
               if(ticket > 0) {
                   // 票存在，卖票 tick--
                   System.out.println(Thread.currentThread() + "正在卖" + ticket);
                   ticket--;
               }
            }
        }
    }
}
