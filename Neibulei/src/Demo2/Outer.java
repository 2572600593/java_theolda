package Demo2;

public class Outer {
//    访问重名的的外部类变量：外部类.this.外部类的成员变量名

    int num = 10; // 外部类的成员变量
    class Inner {

        int num = 20;  // 内部类的成员变量

        public void method() {
            int num = 30;  // 内部类方法的局部变量
            System.out.println(num); //30 局部变量
            System.out.println(this.num); //20 内部类的成员变量
            System.out.println(Outer.this.num); //10 外部类的成员变量
        }
    }
}
