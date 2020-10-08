package Demo1;

/*
格式：
public interface 接口名称 {
    // 接口内容
}

 */

public class Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.method1();  //抽象方法

        a.methodDefault();  //默认方法
    }
}
