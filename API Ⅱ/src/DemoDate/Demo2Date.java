package DemoDate;

import java.util.Date;

public class Demo2Date {

    public static void main(String[] args) {
        demo2();
    }

    /*
    long getTime()（相当于 System.currentTimeMillis()方法）
    返回 1970 年 1 月 1 日至今的毫秒数
     */
    public static void demo3() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date类的带参构造方法
    Date(long date):传递毫秒值，把毫秒值转换为Date日期
     */
    public static void demo2() {
        Date date = new Date(0l);
        System.out.println(date);
    }

    /*
    Date类的空参数构造方法，Date()获取当前系统的日期和时间
     */
    public static void demo1() {
        Date date = new Date();  // 获取当前时间
        System.out.println(date);
    }
}
