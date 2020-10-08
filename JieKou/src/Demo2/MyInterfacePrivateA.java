package Demo2;

/*
私有方法
 */

public interface MyInterfacePrivateA {

    public default void method1() {
        System.out.println("1");
    }

    public default void method2() {
        System.out.println("2");
    }

    private void methodCommon() {
        System.out.println("aa");
        System.out.println("bb");
    }
}
