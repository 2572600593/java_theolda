package DemoDate;

/*
    java.text.DateFormat:是日期/时间格式化子类的抽象类
    作用：
        格式化（也就是日期->文本）、解析（文本->日期）
    成员方法：
        String format(Date date)  日期->文本
        Date parse(String source)  文本->日期
    DateFormat 是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类
    java.text.SimpleDateFormat extends DateFormat

    构造方法：
        SimpleDateFormat(String pattern)
        参数：String pattern:传递指定格式
        格式：区分大小写（字母不可更改）
            y   年
            M   月
            d   日
            H   时
            m   分
            s   秒
        写对应模式，会将模式替换为对应的日期和时间
            “yyyy-MM-dd HH:mm:ss”
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) throws ParseException {
        demo2();
    }

    /*
    使用DateFormat类中的方法parse,把符合构造方法中模式的字符串解析为日期
    parse方法声明了一个异常，叫ParseException
    如果字符串和构造方法的模式不一样，那么程序就会抛出异常
     */
    public static void demo2() throws ParseException {
        // 创建SimpleDateFormat对象，构造方法中要传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 调用parse方法
        // Date parse(String source),符合模式的字符串，解析为日期
        Date date = sdf.parse("2020年10月10日 16:48:09");
        System.out.println(date);
    }

    /*
    使用DateFormat类中的方法format,把（数字）日期格式化为（字母）文本
     */
    public static void demo1() {
        // 创建SimpleDateFormat对象，构造方法中要传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();  // （无参构造方法）获取当前时间
        String s = sdf.format(date);
        System.out.println(date);
        System.out.println(s);
    }
}
