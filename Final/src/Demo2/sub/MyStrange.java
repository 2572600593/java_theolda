package Demo2.sub;

import Demo2.MyClass;

public class MyStrange {  // 不同包， 不继承

    public void method_Strange() {
        System.out.println(new MyClass().num);
    }
}
