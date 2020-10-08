package Static;

public class Students {
    private String name;
    private int age;

    private int id; //学号 按顺序自动生成
    static String room; //所在教室
    private static int idcounter = 0;  //学号计数器，每new一个新对象时计数器++

    public Students() {
        idcounter++;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idcounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
