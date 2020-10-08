package Demo1;

public class Demo {
    public static void main(String[] args) {
//        Animal ani = new Animal();  错误，因为抽象类不能new
//        Cat cat = new Cat();  错误，原因同上。

        FatCat ft = new FatCat();
        ThinCat tt = new ThinCat();
        ft.eat();
        tt.eat();
    }
}
