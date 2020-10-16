package Demo1;

// 使用接口并重写Comparable方法
//                                 接口     排序的类型
public class Person_Comparable implements Comparable<Person_Comparable> {
    private String name;
    private int age;

    public Person_Comparable() {
    }

    public Person_Comparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写排序的规则
    @Override
    public int compareTo(Person_Comparable o) {
//        return 0;  // 默认返回0
//        自定义比较规则，比较两个人的年龄（this,参数Person）
//        return this.getAge() - o.getAge();  // 年龄升序排序
        return o.getAge() - this.getAge();  // 年龄降序排序
    }
}
