package Demo2;

public class Use {

    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();  // 创建内部类对象
        in.method();
    }
}
