package String;

/*
字符串的创建
3种构造方法：
public String() 创建一个空白字符串，不含有任何内容
public String(char[] array) 根据字符数组的内容，来创建对于的字符串
public String(byte[] array) 根据字节数组的内容，来创建对于的字符串

1种直接创建方法：
String str = "Hello";
 */
public class DemoCreate {
    public static void main(String[] args) {
        // 空参构造
        String str1 = new String();
        System.out.println(str1);

        // 使用字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println(str2);

        // 使用字节数组创建字符串
        byte[] byteArray = {65,66,67};
        String str3 = new String(byteArray);
        System.out.println(str3);
    }
}
