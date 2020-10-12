package Demo2FanXing;

// 修饰符 <代表泛型的变量> 返回值类型 方法名(参数) { }

// 含有泛型的方法，在调用方法的时候确定泛型的数据类型
public class MyGenericMethod {

    // 定义含有泛型的方法
    public <E> void method1(E index) {
        System.out.println(index);
    }

    public static <E> void method2(E index) {
        System.out.println(index);
    }

    public <E> E show(E index) {  //有返回值
        return index;
    }
}
