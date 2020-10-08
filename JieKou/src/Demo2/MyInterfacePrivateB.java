package Demo2;

public interface MyInterfacePrivateB {

    public static void method1() {
        System.out.println("1");
    }

    public static void method2() {
        System.out.println("2");
    }

    private static void methodCommon() {
        System.out.println("aa");
        System.out.println("bb");
    }
}
