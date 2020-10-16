package Demo1;

import java.util.ArrayList;
import java.util.Collections;
/*
    自定义类型的排序
    被排序的集合里边存储的元素必须实现Comparable，
    重写接口中的方法定义排序的规则。

    Comparable接口的排序规则：
        自己（this）- 参数 ：升序
    Comparator(Integer o1,Integer o2)比较规则：
        o1 - o2 :升序

 */

public class CollSort {
    public static void main(String[] args) {
        ArrayList<Person_Comparable> list = new ArrayList<>();
        Person_Comparable p1 = new Person_Comparable("a",2);
        list.add(p1);
        list.add(new Person_Comparable("b",1));

        Collections.sort(list);
        System.out.println(list);
    }
}
