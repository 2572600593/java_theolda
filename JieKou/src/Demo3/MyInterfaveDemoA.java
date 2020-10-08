package Demo3;

public interface MyInterfaveDemoA {

    public abstract void methodA();

    public abstract void methodcommon();

    public default void methoddefault() {
        System.out.println('s');
    }
}
