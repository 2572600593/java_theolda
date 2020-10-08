package Random;

import java.util.Random;

//Random类,用来生成随机数字
//        1.导包
//        importjava.util.Random;
//
//        2.创建
//        Randomr=newRandom();//小括号中留空即可
//
//        3.使用
//        获取一个随机int数（范围是int，包含正负）,int num = r.next Int();
//        获取一个随机int数（参数代表范围，左闭右开区间），int num = r.nextInt(3);
//           实际范围[0,3),即 0 ,1 ,2;

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();  // 只是创建随机数对象，并没有产生随机数
        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}

