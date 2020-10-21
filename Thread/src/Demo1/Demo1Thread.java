package Demo1;

public class Demo1Thread {
    public static void main(String[] args) {
        // 创建自定义线程对象
        MyThread mt = new MyThread();
        mt.start();  // 开启新线程
        for(int i = 0;i < 10;i++) {
            System.out.println("main线程" +"--"+ i);
        }
    }
}
