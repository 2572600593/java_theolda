package Static;

/* 一旦使用static修饰成员方法，那就会变成静态方法，静态方法不属于对象，而是属于类。

 如果没有static关键字，必须先创建对象，然后通过对象才能使用它。

 静态方法不能访问非静态变量()
 因为内存中是先有的静态内容，后有的非静态内容

 静态方法中不使用 this 关键字*/

public class DemoStaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); //先创建对象然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法，可以通过对象名进行调用，也可以通过类名称进行调用
        MyClass.methodstatic();  //推荐
        obj.methodstatic(); //也可以这样写，不推荐
    }

}
