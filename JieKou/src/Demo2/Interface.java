package Demo2;

/*
不能通过接口实现类对象调用接口当中的静态方法

用法：用接口名直接调用
 */
public class Interface {
    public static void main(String[] args) {
        // 创建实现类对象
        MyInterfaceStatic.method1();
    }
}
