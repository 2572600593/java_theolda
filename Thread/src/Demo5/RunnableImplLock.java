package Demo5;

/*
    Lock锁
    使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口的lock方法获取锁
        3.在可能会出现安全问题的代码后调用Lock接口的unlock方法释放锁
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImplLock implements Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;

//    1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
//            2.在可能会出现安全问题的代码前调用Lock接口的Lock方法获取锁
            l.lock();
            if(ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread() + "正在卖" + ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
//                  3.在可能会出现安全问题的代码后调用Lock接口的unlock方法释放
                    l.unlock();  // 无论程序是否异常，都会把锁释放
                }
            }
        }
    }
}
