package cn.package6;

// 间接访问private成员变量，就是定义一对儿getter/setter方法

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("My name is " + name + ",and my age is " + age);
    }

    // 这个成员方法，专门用于向age设置数据
    public void setAge(int num) {
        if(num > 100 && num < 0)
            age = num;
        else
            System.out.println("数据有误！");
    }

    // 这个成员方法，专门用于获取age数据
    private int getAge() {
        return age;
    }
}

