package Demo7;

/*
    测试类：
    包含main方法，程序执行的入口，启动程序。
    创建包子对象，
    创建包子铺线程，开启，生产包子，
    创建包子线程，开启，吃包子。
 */
public class DemoCase {
    public static void main(String[] args) {
        // 创建包子对象
        Baozi bz = new Baozi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
