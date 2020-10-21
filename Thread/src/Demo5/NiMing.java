package Demo5;

// 匿名内部类实现线程的创建
public class NiMing {
    public static void main(String[] args) {

//      Thread
        new Thread() {  // 1.继承Thread类
            @Override
            public void run() {  // 2.重写run方法
                for(int i = 0;i < 20;i++) {
                    System.out.println(Thread.currentThread().getName() + 'a');
                }
            }
        }.start();

//      Runnable
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for(int i = 0;i < 20;i++) {
                    System.out.println(Thread.currentThread().getName() + 'b');
                }
            }
        };
        new Thread(r).start();

//      简化Runnable接口的方式
        new Thread(new Runnable() {  // 1.将Runnable的子类对象传递给Thread的构造方法
            @Override
            public void run() {  // 2.重写run方法
                for(int i = 0;i < 20;i++) {
                    System.out.println(Thread.currentThread().getName() + 'c');
                }
            }
        }).start();
    }
}
