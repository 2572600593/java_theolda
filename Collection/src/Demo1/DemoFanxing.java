package Demo1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoFanxing {

    public static void main(String[] args) {
    /*
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦，存储的使什么类型，取出的就是什么类型
            2.把运行期异常，提升到了编译期（写代码时报错）
     */
        demo1();
    }

    public static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1);
        Iterator<String> i = list.iterator();
        while(i.hasNext()) {
            String s = i.next();
            System.out.println(s.length());
        }
    }

}
