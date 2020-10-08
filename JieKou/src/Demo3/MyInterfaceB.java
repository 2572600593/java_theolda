package Demo3;

public interface MyInterfaceB {

    // 接口不能有静态代码块
//    static {
//    }

    // 接口不能有构造方法
//    public MyInterface() {
//    }

    // 一个类可以同时实现多个接口
/*    格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    //覆盖重写所有抽象方法
}
 */

    public abstract void methodB();

}
