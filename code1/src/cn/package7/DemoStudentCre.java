package cn.package7;

public class DemoStudentCre {
    public static void main(String[] args) {
        StudentCre stu1 = new StudentCre();     // 无参构造
        System.out.println("======================");

        StudentCre stu2 = new StudentCre("赵",20);   // 全参构造
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());

        stu2.setAge(35);   // 可以用set来修改对象内容
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());
    }
}
