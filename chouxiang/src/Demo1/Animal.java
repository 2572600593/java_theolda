package Demo1;

/*
将 eat 定义为抽象方法：加上abstract关键字，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类，必须是抽象类才行。即在class前加abstract。

如何使用抽象类和抽象方法：
1.不能直接创建new抽象方法。
2.必须用一个子类继承抽象类。
3.子类必须覆盖重写抽象父类当中所有的抽象方法。
    覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
4.创建子类对象进行使用。
 */

public abstract class Animal {  //父亲

    public abstract void sleep();

    public abstract void eat();  //抽象方法

}
