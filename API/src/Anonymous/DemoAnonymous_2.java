package Anonymous;

import java.util.Scanner;

public class DemoAnonymous_2 {
    public static void main(String[] args) {
        //普通使用方式
//      Scanner sc = new Scanner(System.in);
//      int num = sc.nextInt();

        //匿名对象使用方式
//      int num = new Scanner(System.in).nextInt();
//      System.out.println(num);

        //使用一般方法传入参数
//      Scanner sc = new Scanner(System.in);
//      methodParam(sc);

        //使用匿名对象传入参数
//      methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入为：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入为：" + num);
    }

    public static Scanner methodReturn() {  //返回Scanner类型
//      Scanner sc = new Scanner(System.in);
//      return sc;
        return new Scanner(System.in);
    }

}

