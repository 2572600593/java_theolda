package cn.package7;
/*
构造方法
是专门用来创建对象的方法，当我们通过关键字new创建对象的时，就是在调用构造方法。
格式：
public 类名称(参数类型 参数方法) {
    方法体
}

注意事项：
1.构造方法的名称必须和所在类的方法完全一样，就连大小写也要一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有构造任何构造方法，那么编译器将默认生成一个简易构造方法，没有参数和方法体
public StudentCre() {}
5.一旦编写了至少一个构造方法，那么编译器将不再自动生成
6.构造方法也是可以进行重载的
*/
public class StudentCre {

    String name;
    int age;
    public StudentCre() {
        System.out.println("无参构造方法。");
    }

    public StudentCre(String name, int age) {     // 重载
        System.out.println("全参构造方法。");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
