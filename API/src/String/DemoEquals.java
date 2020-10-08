package String;

/*
字符串比较方法

== 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法

public boolean equals(Object obj),参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则false
注意事项：
1.任何对象都能用Object进行接收
2.equals方法具有对称性，也就是 a.equals(b) 和 b.equals(a) 结果一样
3.如果比较双方一个常量一个变量，推荐常量在前，变量在后，即"abc".equals(str3)

s1.equalsIngoreCase(s2) 进行不区分大小写的内容比较
 */

import org.w3c.dom.ls.LSOutput;

public class DemoEquals {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str2.equals(str3)); //true
        System.out.println("abc".equals(str3)); //true  推荐
        System.out.println(str3.equals("abc")); //true

        System.out.println(str1.equalsIgnoreCase(str2)); // 不区分大小写的比较
    }

}
