package DemoStringBuilder;

//    public String toString():将当前StringBuilder对象转换为String对象。

public class toString {

    public static void main(String[] args) {

        // 链式创建 String --> StringBuilder
        StringBuilder sb = new StringBuilder("Hello").append("World").append("Java");
        // 调用方法 StringBuilder --> String
        String str = sb.toString();
        System.out.println(str);
    }
}
