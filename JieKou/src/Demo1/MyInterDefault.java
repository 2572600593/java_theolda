package Demo1;

/*
定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

 */

public interface MyInterDefault {

    public abstract void method1();

    //新添加的方法为 default,会继承到实现类，不需要再修改
    public default void methodDefault() {
        System.out.println("默认方法");
    }
}
