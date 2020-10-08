package Demo2;

/*
在父类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方法：
直接 通过子类对象访问成员变量
间接 通过成员方法访问成员变量
 */

public class USE {
    public static void main(String[] args) {
        FU fu = new FU();
        System.out.println(fu.numFU);

        ZI zi = new ZI();
        System.out.println(zi.numFU);
        System.out.println(zi.numZI);

        System.out.println(zi.num);  //优先子类
        System.out.println(fu.num);  //优先父类

        zi.methodzi();
        fu.methodfu();
    }
}
