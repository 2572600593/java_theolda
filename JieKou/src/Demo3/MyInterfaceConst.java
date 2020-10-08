package Demo3;

/*
接口中也可以定义成员变量，但必须使用public static final三个关键词进行修饰
从效果上看，这其实就是接口的常量
public static final 数据类型 常量名 = 数据;

注意：
1.接口中的常量必须赋值，不能不赋值。
2.接口中常量名完全大写，并用下划线分隔（推荐命令）。
 */

public interface MyInterfaceConst {

    public static final int NUM_OF_MY_CLASS = 10;  // 接口中的常量，不可修改
}
