package DemoObject;

public class DemoToString {

    public static void main(String[] args) {
        Person p = new Person("a",16);
        String s = p.toString();
        System.out.print(s);  // 打印地址值
    }

    // 看一个类是否重写了toString,直接打印这个类的对象即可，若没重写则打印地址值
    
}
