package Demo2.sub;

import Demo2.MyClass;

public class MySub extends MyClass {  // 不同包， 有继承

    public void method_Sub() {
        System.out.println(super.num);
    }
}
