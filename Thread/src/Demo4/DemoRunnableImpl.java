package Demo4;

// 实现类
public class DemoRunnableImpl implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName() +"-->"+ i);
        }
    }
}
