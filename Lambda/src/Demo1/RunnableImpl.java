package Demo1;

public class RunnableImpl {
    public static void main(String[] args) {
        // 常见的匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类执行");
            }
        }).start();

        // Lambda方法
        new Thread(() -> {
            System.out.println("Lambda执行");
        }).start();
    }
}
