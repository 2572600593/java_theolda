package Demo1;
/*
public final class 类名称 {

}
 */

public class Myclass {
    public static void main(String[] args) {
        // 创建 User 对象（User是一个标准类）
        final User user = new User();
        // 创建另一个 User 对象
//        user = new User(); 报错，指向了新的对象，地址值改变。

        // 调用setname方法（只改变值）
        user.setName("张三"); // 可以修改
    }
}

