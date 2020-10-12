package Demo1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {

    public static void main(String[] args) {
        // 使用多态方法创建集合
        Collection<String> coll = new ArrayList<String>();

        // 添加元素到集合
        coll.add("111");
        coll.add("aaa");
        // 使用迭代器遍历
        Iterator<String> it = coll.iterator();  // 获取迭代器的实现类对象，并且把指针(索引)指向集合的-1位置

        while(it.hasNext()) {  // 判断有没有下一个元素
            String s = it.next();  // 取出集合终点下一个元素
            System.out.println(s);
        }
        // for循环形式
        for(Iterator<String> it2 = coll.iterator();it.hasNext();) {
            String s2 = it2.next();  // 做了两件事：1.取出下一个元素  2.会把指针向后移动一位
            System.out.println(s2);
        }
    }
}
