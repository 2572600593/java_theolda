package cn.package6;

/*
用 setter 放进去
用 getter 放进去
*/

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("鹿晗");
        stu.setAge(12);
        stu.setMale(true);

        System.out.println("name:"+stu.getName());
        System.out.println("age:"+stu.getAge());
        System.out.println("male:"+stu.isMale());
    }

}
