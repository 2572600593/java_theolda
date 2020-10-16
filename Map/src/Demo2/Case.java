package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
练习：
    每位学生（姓名，年龄）都有自己的家庭住址。
    那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值。
*/
public class Case {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();
        Student student1 = new Student("a",1);
        map.put(student1, "上海");
        map.put(new Student("b",2),"北京");
        map.put(new Student("c",3),"山东");

        Set<Student> keys = map.keySet();
        for(Student key : keys) {
            String value = map.get(key);  // 注意：是 map.get ! 键找值
            System.out.println(key + "---" + value);  // 要输出key中的Student对象，需要先进行toString的重写
        }
    }
}
