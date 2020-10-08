package Static;

public class MyClass {
    int num;
    static int numstatic;

    public void method() {  //这是一个普通方法
        System.out.println('0');
    }

    public static void methodstatic() {  //这是一个静态方法
        System.out.println('1');
        System.out.println(numstatic); //静态方法可以访问静态变量
        //System.out.println(num);       //不能访问非静态

    }
}


