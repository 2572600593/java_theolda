package cn.package8;
/*
标准类
一个标准的类通常需要拥有下面四个组成部分：

1.所有变量都要使用private关键字修饰
2.所有成员变量编写一对儿Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

这样标准的类也叫做Java Bean
*/
public class StudentStandard {
    private String name;
    private int age;

    public StudentStandard() {  // 无参数构造方法
    }

    public StudentStandard(String name, int age) {  // 全参数构造方法
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
