package cn.package6;

import java.sql.SQLOutput;

/*
局部变量和成员变量不同处
1.定义的位置不一样
2.作用的范围不一样
3.默认值不一样
    局部变量：没有默认值，必须手动赋值
    成员变量：如果没有赋值会有默认值
4.内存位置不一样
    局部变量：位于栈内存
    成员变量：位于堆内存
5.生命周期不一样
    局部变量：随着方法进栈儿诞生，随着方法出栈而消失
    成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失

 */
public class DemoVariableDifference {

    String name; //成员变量

    public void methodA() {
        int num = 20; //局部变量
        System.out.println(num);;
        System.out.println(name);
    }

    public void methodB(int param) {  //方法的参数是局部变量
        System.out.println(param);
        int age;          // 局部变量
//        System.out.println(age);    //没赋值 不能用
    }
}
