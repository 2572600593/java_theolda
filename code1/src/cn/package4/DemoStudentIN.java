package cn.package4;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1.导包，也就是指出需要使用的类，在什么位置。
import 包名称.类名称
import cn.package4.DemoStudents;
对于和当前类属于同一个包的情况，可以省略包语句不写。

2.创建。
格式：
类名称 对象名 = new 类名称()；
Student stu = new student();

3.使用。
分两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名

注意事项：
如果成员变量没有赋值，那么将有一个默认值

*/
public class DemoStudentIN {
    public static void main(String[] args) {
        //1.导包
        //import cn.package4.DemoStudents;

        //2.创建
        //根据DemoStudents类，创建一个stu对象
        DemoStudents stu = new DemoStudents();

        //3.使用
        //对象名.成员变量名
        System.out.println(stu.age);
        System.out.println(stu.name);

        //改变对象当中的成员变量数值内容
        stu.name = "123";
        stu.age = 18;
        System.out.println(stu.age);
        System.out.println(stu.name);

        //调用对象的成员方法，格式
        //对象名.成员方法名()
        stu.eat();
        stu.grade();
    }

}
