package Random;

import java.util.Random;
import java.util.Scanner;

public class RandomPractice2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1; // 范围 1 ~ 100
        Scanner sc = new Scanner(System.in);
        int guess;
        int flag = 0;
        int cnt = 0;
        while(flag == 0) {
            guess = sc.nextInt();
            if(guess < num) {
                System.out.println("猜小了!");
            }
            else if(guess > num) {
                System.out.println("猜大了!");
            }
            else if(guess == num) {
                System.out.println("Bingo!");
                flag = 1;
            }
            cnt++;
        }
        System.out.println("一共猜了" + cnt + "次。");
    }
}
