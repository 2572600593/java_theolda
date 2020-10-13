package DemoHashSet;

/*
    哈希值：是一个十进制的整数，是由系统随即给出（逻辑地址）
    int hashCode() 返回对象的哈希值
 */
public class DemoHashCode {
    public static void main(String[] args) {
//        P类继承了Object类，所有可以是要Object类的hashCode方法
        Person p1 = new Person();
        int i = p1.hashCode();
        System.out.println(i);

        Person p2 = new Person();
        int i2 = p2.hashCode();
        System.out.println(i2);

    }
}
