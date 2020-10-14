package DemoHashSet;

import java.util.HashSet;

public class SetHash {

    public static void main(String[] args) {
//        HashSet存储自定义类型元素，需要重写Hashcode和equals方法
        HashSet<Student> set = new HashSet<Student>();
        Student p1 = new Student("a",1);
        Student p2 = new Student("a",1);
        Student p3 = new Student("b",2);
        set.add(p1);
        set.add(p2);
        set.add(p3);
//        System.out.println(set);  // 打印方法toString需要重写
        for(Student s : set) {
            System.out.println(s);
        }
    }
}
