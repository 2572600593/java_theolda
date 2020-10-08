package Demo2;

public class DemoMain {

    public static void main(String[] args) {
        Animal a = new Cat(); // 向上转型
        a.eat();

        Cat c = (Cat) a; // 向下转型，还原成为之前的子类对象（即Cat）
        c.catchmouse();  //调用只在子类的方法

//        Dog dog = (Dog) a;
    }
}
