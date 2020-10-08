package Anonymous;
/*
创建匿名对象
类名称 对象名 = new 类名称();

注意事项：
匿名对象只能使用一次
适用于有一个对象只使用一次
*/
public class DemoAnonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }
}


