package Demo4;

/*
注意：
1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
2.匿名对象，在【调用方法】时，只能调用唯一一次。
3.匿名内部类是省略了【实现类/子类】，匿名对象是省略了【对象名称】。
 */

public class DemoMain {

    public static void main(String[] args) {
        // 使用匿名内部类，但不是匿名对象
        MyInterface obj = new MyInterface() {  // 大括号中是匿名内部类
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法");
            }
        };
        obj.method();  // 只使用了接口，没使用Impl

        /// 使用匿名内部类，同时也使用了匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类+对象实现方法");
            }
        }.method();  // 直接在匿名内部类后面引用方法



//        MyInterface impl = new MyInterfaceImpl();  多态写法
//
//        MyInterfaceImpl impl = new MyInterfaceImpl();   接口写法
//        impl.method();
    }
}
