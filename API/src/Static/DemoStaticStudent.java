package Static;

import ArrayList.Student;

public class DemoStaticStudent {
    public static void main(String[] args) {
        Students.room = "101教室";
        Students one = new Students("1",1);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Students.room);

        Students two = new Students("2",2);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Students.room);
    }
}
