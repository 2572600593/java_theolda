package Demo;

public class Demo {

    public static void main(String[] args) {
        Teacher one = new Teacher();  // 创建一个子类对象
        one.method();

        Assistant two = new Assistant();// 创建另一个子类对象
        two.method();
    }

}
