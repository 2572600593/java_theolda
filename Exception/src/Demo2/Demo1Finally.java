package Demo2;

public class Demo1Finally {

    public static void main(String[] args) {

    }

    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            // 一定会执行，不要在finally中写return
            a = 100;
            return a;
        }
    }
}
