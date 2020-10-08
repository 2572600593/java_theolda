package cn.package2;

/*
    记住唯一的名称，可以实现多个功能

    方法重载相关因素：
    1.参数个数
    2.参数类型
*/

public class Overload {
    public static void main (String[] args) {
//        System.out.println(sumTwo(10,20));
//        System.out.println(sumThree(10,20,30));
        System.out.println(sum(10,20,35));
    }

    public static int sum (int a,int b) {
        return a + b;
    }

    public static int sum (int a,double b) {
        return (int)(a + b);
    }

/*  两种可以同时存在的语句
    public static int sum (int a,double b) {
        return a + b;

    public static int sum (duoble a,int b) {
        return a + b;
    }*/

    public static int sum (int a,int b,int c) {
        return a + b + c;
    }
}
