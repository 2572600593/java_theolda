package Demo2;

/*
    返回线程名称(基础方法)：
        1.使用Thread类中的方法getName返回线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 */
public class MyThread extends Thread {
    public MyThread(String b) {
    }

    public MyThread() {

    }

    @Override
    public void run() {
        // 获取线程名称 方法1
//        String name = getName();
//        System.out.println(name);

        // 方法2
        Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);

        // 方法3
        System.out.println(Thread.currentThread().getName());
    }
}
