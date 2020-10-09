package DemoObject;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    public String toString() {  // toString的重写
        return "Person{name="+name+",age="+age+"}";
    }*/


//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
    重写equals,比较两个对象的属性(name,age)
    Object obj = new Person("a",1)  使用了多态。
    但多态有个特性：无法访问子类特有的属性，所以这里使用【向下转型】 。
    Person obj = new Person();
     */

//    public boolean equals(Object obj) {
//        if(obj == null)
//            return false;
//        if(obj == this)
//            return true;
//        // 增加一个判断，防止类型转换异常（ClassCastException）
//        // 使用向下转型，把obj转换为Person类型
//        if(obj instanceof Person) {
//            Person p = (Person) obj;
//            // 同时比较两个对象的属性
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        else
//            return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术判断，判断o是否为Person类型。等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
