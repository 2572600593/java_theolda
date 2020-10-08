package cn.package8;

public class DemoStudent {
    public static void main(String[] args) {
        StudentStandard stu1 = new StudentStandard();
        stu1.setName("zhao");
        stu1.setAge(20);
        System.out.println("1."+stu1.getName() + "\t2." + stu1.getAge());
        StudentStandard stu2 = new StudentStandard("gu",10);
        System.out.println("1."+stu2.getName() + "\t2." + stu2.getAge());
        stu2.setAge(25);
        System.out.println("1."+stu2.getName() + "\t2." + stu2.getAge());
    }
}

