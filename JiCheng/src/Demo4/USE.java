package Demo4;

/*
方法的重写 (Override)
概念

 */


public class USE {

    public static void main(String[] args) {
        ZI zi = new ZI();
        zi.methodZI();
        zi.methodFU();

        zi.method(); // 优先子类，若没有则往上找
    }

}
