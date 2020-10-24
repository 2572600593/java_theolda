package Demo7;

/*
    生产者（包子铺）类是一个线程类，可以继承Thread
    设置线程任务（run）：生产包子
    对包子状态进行判断
    true:有包子
        包子铺调用wait方法进入等待状态
    false:没有包子
        包子铺生产包子
            交替生产两种包子，有两种状态（i%2）
        包子铺生产好了包子
        修改包子状态为true
        唤醒吃货线程，让吃货线程吃包子

    使用同步技术保证同一时刻两个线程只有一个在执行。
    可以将包子对象设为锁对象，这样包子铺和包子的类需要将包子作为参数传递。
        1.在成员位置创建包子变量
        2.使用带参构造方法，为这个包子变量赋值
 */
public class BaoZiPu extends Thread {
//    1.在成员位置创建包子变量
    private Baozi bz;
//    2.使用带参构造方法，为这个包子变量赋值
    public BaoZiPu(Baozi bz) {
        this.bz = bz;
    }
//    设置线程任务（run）：生产包子
    @Override
    public void run() {
        int count = 0;
        while(true) {  // 使一直生产包子
//        使用同步技术保证同一时刻两个线程只有一个在执行。
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后执行，交替生产两种包子
                if (count % 2 == 0) {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉馅";
                } else {
                    bz.pier = "冰皮";
                    bz.xianer = "三鲜馅";
                }
                count++;
                System.out.println("正在生产：" + bz.pier + bz.xianer);

                // 生产包子需要3000毫秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            修改包子状态为true
                bz.flag = true;
//            唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("已经生产了：" + bz.pier + bz.xianer + "包子，吃货可以开吃了!");
            }
        }
    }
}
