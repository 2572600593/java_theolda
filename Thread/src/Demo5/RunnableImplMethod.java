package Demo5;

// 同步方法解决线程安全

public class RunnableImplMethod implements Runnable {
    // 定义一个多个线程共享的票源
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            // 调用同步方法
            payTicketStatic();
        }
    }

    // 定义一个同步方法
    public static synchronized void payTicketStatic() {
        if(ticket > 0) {
            // 票存在，卖票 tick--
            System.out.println(Thread.currentThread() + "正在卖" + ticket);
            ticket--;
        }
    }
}
