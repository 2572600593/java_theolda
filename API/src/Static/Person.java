package Static;

public class Person {

    public Person() {               // 构造方法
        System.out.println("构造");
    }

    static {
        System.out.println("静态！");
    }

}
