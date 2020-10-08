package Demo1;

/*
new谁  用谁
注意：编译看左，运行看右
 */
public class DemoMultiMethod {

    public static void main(String[] args) {
        FU obj = new ZI();
        obj.method();  // 调用子类方法(new的右边)

        obj.methodfu(); //子类没有，向上找父类

        // 编译看左，左边是FU，FU中没有methodzi方法，所以编译出错
//      obj.methodzi();
    }
}
