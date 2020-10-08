package cn.package6;

public class Student {
    private String name;
    private int age;
    private boolean male; //判断性别

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {   // 对于基本类型当中的boolean，它的getter方法要写成 isXxx 类型
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
