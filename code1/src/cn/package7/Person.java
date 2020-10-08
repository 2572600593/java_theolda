package cn.package7;

/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量
    如果要使用类重点成员变量，需要使用 格式：
    this.成员变量名
*/

public class Person {
    public String name;
//    String name; // 我自己的名字

/*
    参数（局部变量）和成员变量重名，都为name,
    如果希望my name后面是成员变量，需添加关键字this.name。
*/
    public void sayHello(String name) {
//        System.out.println("Hello "+name+",my name is "+name);
        System.out.println("Hello "+name+",my name is "+this.name);
    }
}
