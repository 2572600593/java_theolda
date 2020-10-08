package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoPractice_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("1",1);
        Student two = new Student("2",2);
        Student three = new Student("3",3);
        Student four = new Student("4",4);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        Student stu;
        for(int i = 0;i < list.size();i++) {
            stu = list.get(i);
            System.out.println("name: " + stu.getName() + " age: " + stu.getAge());
        }
    }
}
