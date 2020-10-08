package Static;

import ArrayList.Student;
public class DemoStaticField {
    public static void main(String[] args) {
        Students stu1 = new Students("郭靖",19);
        Students stu2 = new Students("黄蓉",16);
        stu1.room = "101";
        System.out.println(stu1.getName() + stu1.getAge() + stu1.room + stu1.getId());
        System.out.println(stu2.getName() + stu2.getAge() + stu2.room + stu2.getId());
        System.out.println(Students.room);
    };

}
