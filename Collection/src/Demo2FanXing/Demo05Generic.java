package Demo2FanXing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ？:代表任意的数据类型
    使用方法：
        不能创建对象使用，
        只能作为方法的参数使用。
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");

        printArray(list1);
        printArray(list2);
    }
/*
    定义一个方法，能遍历所有类型ArrayList集合
    这时候我们不知道ArrayList集合使用的什么数据类型，可用泛型的通配符？来接受数据类型
    注意：
        泛型没有继承概念,故不能使用Object来代替？
 */
    public static void printArray(ArrayList<?> list) {
        // 使用迭代器遍历
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next()方法，取出的元素时Object，可以接受任意类型的数据类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
