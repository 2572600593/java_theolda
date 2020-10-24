package Demo7;

public class ChiHuo extends Thread {
//    1.在成员位置创建包子变量
    private Baozi bz;
//    2.使用带参构造方法，为这个包子变量赋值
    public ChiHuo(Baozi bz) {
        this.bz = bz;
    }

    //    设置线程任务（run）：生产包子
    public void run() {
        while(true) {  // 一直吃包子
            synchronized(bz) {
                if(bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 唤醒代码：吃包子
                System.out.println("吃货正在吃：" + bz.pier + bz.xianer);
                // 吃完包子后，修改包子状态为false
                bz.flag = false;
                System.out.println("吃货已经吃完，包子铺开始继续生产");
                System.out.println("------------------------------------");
                // 唤醒包子铺线程，生产包子
                bz.notify();
            }
        }
    }
}
