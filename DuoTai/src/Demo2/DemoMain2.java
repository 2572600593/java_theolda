package Demo2;

/*
安全的向下转型,进行instanceof判断
格式：
对象 instanceof 类型 ，返回值为true or false
 */
public class DemoMain2 {

    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        if(a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.watchdoor();
        }

        if(a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.catchmouse();
        }
    }
}
