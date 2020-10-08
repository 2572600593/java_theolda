package Math;

public class DemoMath {

    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-2));    // 2
        System.out.println(Math.abs(-3.1));  // 3.1

        //向上取整
        System.out.println(Math.ceil(3.1));  // 4.0

        //向下取整（抹零）
        System.out.println(Math.floor(3.9)); // 3.0

        //四舍五入
        System.out.println(Math.round(3.4)); // 3
        System.out.println(Math.round(3.5)); // 4
    }

}
