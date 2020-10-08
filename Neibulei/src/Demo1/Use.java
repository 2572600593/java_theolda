package Demo1;

public class Use {

    public static void main(String[] args) {

//        直接方法
        Body.Heart heart = new Body().new Heart();  // 直接创建Heart对象
        heart.beat();

//        间接方法
        Body body = new Body();
        body.method();   // 在method中创建Heart的对象，以间接调用
    }

}
