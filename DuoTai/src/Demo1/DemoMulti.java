package Demo1;
/*
1.直接通过对象名称访问成员变量
2.间接通过成员方法访问成员变量
 */
public class DemoMulti {

    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用指向了右侧子类的对象
        FU obj = new ZI();
        System.out.println(obj.num); // 10

        obj.showNumber(); // 若子类已经覆盖重写，就按子类，否则按照父类
    }
}
