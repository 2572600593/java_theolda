package Demo1;

public class Body {  // 外部类
    class Heart {  // 成员内部类

        public void beat() {
            System.out.println("心脏跳动");
            System.out.println("外部类的name" + name);  // 可以访问到外部类的 name
        }
    }
    private String name;  // 若不加getter和setter, name会显示灰色
                          //报错: Private field 'name' is never assigned
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void method() {
        System.out.println("外部");
        Heart heart = new Heart();
        heart.beat();
    }
}
