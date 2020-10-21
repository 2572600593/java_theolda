package Demo1;

public class MyThread extends Thread {

    public MyThread() {
        // 调用父类的String参数的构造方法，指定线程名称
        super();
    }

    // 重写run方法，完成该线程执行的逻辑
    @Override
    public void run() { // 该run()方法的方法体就代表了线程需要完成的任务
        for(int i = 0;i < 10;i++) {
            System.out.println("run" + "--" + i);
        }
    }
}
