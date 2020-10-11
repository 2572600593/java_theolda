package DemoStringBuilder;

/*
public StringBuilder()：构造一个空的StringBuilder容器。
public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
 */
public class Method {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1);  // null
        // 带参构造
        StringBuilder s2 = new StringBuilder("it");
        System.out.print(s2);
    }
}
