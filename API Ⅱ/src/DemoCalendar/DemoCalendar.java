package DemoCalendar;

import java.util.Calendar;
/*
    Calendar类：日历类
    是抽象类，提供了操作日历字段的方法
    Calendar类无法直接创建对象使用，里面有一个静态方法getInstance,该方法返回Calendar类子类对象
 */

public class DemoCalendar {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
