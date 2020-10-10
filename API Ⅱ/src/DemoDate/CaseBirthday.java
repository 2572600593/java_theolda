package DemoDate;

/*
计算出生多少天
    1.使用Scanner类中的方法next，获取出生日期
    2.用DateFormat类中的方法parse，把子u飞船的出生日期解析为Date格式的出生日期
    3.把Date格式的出生日期转化为毫秒值
    4.获取当前的日期，并转化为毫秒值
    5.当前日期的毫秒值 - 出生日期的毫秒
    6.毫秒值转化为天数
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CaseBirthday {
    public static void main(String[] args) throws ParseException {
        // 1.Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期");
        String birthdayDateString = sc.next();
        // 2.parse
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        // 3.把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        // 4.获取当前的日期
        long todayTime = new Date().getTime();
        // 5.当前日期的毫秒值 - 出生日期的毫秒
        long time = todayTime - birthdayDateTime;
        // 6.转化为天
        System.out.println(time/1000/60/60/24);
    }
}
