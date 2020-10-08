package Random;

import java.util.Random;

public class RandomPractice1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 10;
        for(int i=0;i<20;i++) {
            int num = r.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
