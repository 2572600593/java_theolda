package DemoCalendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/*
public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 */
public class DemoMethod {

    public static void main(String[] args) {
        demo4();
    }

    public static void demo4() {
        Calendar c = Calendar.getInstance();
        //将日历对象,转换为日期对象
        Date date = c.getTime();
        System.out.println(date);
    }

    public static void demo3() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        c.add(Calendar.DATE,-3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    public static void demo2() {
        Calendar c = Calendar.getInstance();
        // 设置年为 2000
        c.set(Calendar.YEAR,2000);
        // 设置月为 9
        c.set(Calendar.MONTH,9);
        // 设置日
        c.set(Calendar.DATE,8);
        // 同时设置年月日,使用set的重载方法
        c.set(2000,10,10);

        // 输出
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

    }

    public static void demo1() {
        // 使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);  // 获取日历中的年份
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
