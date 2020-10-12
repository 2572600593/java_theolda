package Demo2FanXing;

public class GenericDemo {

    public static void main(String[] args) {

        MyGenericClass<String> my = new MyGenericClass<>();
        // set
        my.setName("picture");
        // get
        String a1 = my.getName();
        System.out.println(a1);

        // 创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setName(2);
        Integer a2 = my2.getName();

        // 创建含有泛型的方法
        MyGenericMethod my3 = new MyGenericMethod();
        my3.method1(1);
        my3.method1("a");

        my3.method2(2);
        // 静态方法，通过类名.方法名可以直接使用(推荐使用方法)
        MyGenericMethod.method2(2222);

        System.out.println(my3.show(1));
    }
}
