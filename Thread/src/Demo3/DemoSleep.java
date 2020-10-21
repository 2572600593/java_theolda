package Demo3;

// Sleep方法
public class DemoSleep {
    public static void main(String[] args) /*throws InterruptedException*/ {
        for(int i = 0;i < 60;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
