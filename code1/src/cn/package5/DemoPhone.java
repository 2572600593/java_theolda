package cn.package5;

public class DemoPhone {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象

        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.brand = "Apple";
        one.color = "Blank";
        one.price = 3888.0;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("Tom");
        one.sendMessage();

        System.out.println("=============");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        two.brand = "MI";
        two.color = "Blue";
        two.price = 5888.0;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        two.call("Bob");
        two.sendMessage();
    }
}
