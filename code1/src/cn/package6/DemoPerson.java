package cn.package6;

public class DemoPerson {
    public static void main(String[] args) {
            Person person = new Person();
            person.show();

            person.name = "Bob";
            //  person.age = -20    //错误  private不能直接访问！
            person.setAge(20);
            person.show();
    }
}
