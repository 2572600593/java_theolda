package Demo3;

public interface MyInterfaveDemoB {

    public abstract void methodB();

    public abstract void methodcommon();

    public default void methoddefault() {
        System.out.println('s');
    }
}
