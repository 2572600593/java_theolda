package Scnner;

import java.util.Scanner;

public class Practice1_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
//        int MAX = num1;
//        if(MAX < num2) {
//            MAX = num2;
//        }
//        if(MAX < num3) {
//            MAX = num3;
//        }
        int tmp;
        int max;
        tmp = num1 > num2 ? num1 : num2;
        max = tmp > num3 ? tmp : num3;

        System.out.println("max: " + max);
    }

}
