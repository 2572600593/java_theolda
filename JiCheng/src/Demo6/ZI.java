package Demo6;

public class ZI extends FU {
    int num = 10;
    public void method() {
        super.method();
        System.out.println("zi lei");
    }

    public void method2() {
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
