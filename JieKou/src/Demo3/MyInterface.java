package Demo3;
/*
这个子接口中有 4 个方法
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于自身
 */
public interface MyInterface extends MyInterfaveDemoA,MyInterfaveDemoB {

    public abstract void method();

    public default void methoddefault() {  // 重写
        System.out.println("aa");
    }
}
