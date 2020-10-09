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

public class DateFormat {
}
