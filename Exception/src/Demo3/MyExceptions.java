package Demo3;

// 自定义异常类
// 1. 自定义一个编译期异常: 自定义类 并继承于java.lang.Exception。
// 2. 自定义一个运行时期的异常类:自定义类 并继承于java.lang.RuntimeException。
public class MyExceptions extends Exception {
    public MyExceptions() {
        super();
    }

    public MyExceptions(String message) {
        super(message);
    }
}
