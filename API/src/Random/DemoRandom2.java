package Random;

import java.util.Random;

public class DemoRandom2 {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0;i < 10;i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
