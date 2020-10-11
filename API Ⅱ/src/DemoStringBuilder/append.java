package DemoStringBuilder;

/*
    public StringBuilder append():添加任意类型的字符转形式，并返回当前对象自身。
 */

public class append {

    public static void main(String[] args) {
        // 创建对象
        StringBuilder b1 = new StringBuilder();
        // append()接受任意类型
        // append()方法返回的是this,调用了方法b1,则this == b1。
        StringBuilder b2 = b1.append("hello");  // 把b1的地址赋给了b2
        System.out.println(b1);  //hello
        System.out.println(b2);  //hello
        System.out.println(b1 == b2);  // 比较地址,true

        // 使用append方法无需接受返回值
        b1.append(12);
        b1.append('a');
        System.out.println(b1);

        // 链式编程：调用一个方法后返回一个对象。然后使用返回的对象继续调用方法。
        b2.append(1).append("ads").append(54).append(true);
        System.out.println(b2);
    }
}
