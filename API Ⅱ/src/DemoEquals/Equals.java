package DemoEquals;

import DemoObject.Person;

import java.util.ArrayList;

public class Equals {

    public static void main(String[] args) {
        Person p1 = new Person("a",1);
        Person p2 = new Person("a",1);
        boolean b = p1.equals(p2);  // 比较地址
        System.out.println(b);

        ArrayList<Integer> list = new ArrayList<>();
        boolean b2 = p1.equals(list);  // 返回false，类型不支持无法判断
        System.out.println(b2);
    }

}
