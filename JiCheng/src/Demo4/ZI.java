package Demo4;

public class ZI extends FU {

    public void methodZI() {
        System.out.println("ZI执行");
    }

    @Override  // 检测是否重写，不报错即为正确重写
    public void method() {              //重写
        super.method();
        System.out.println("ZI chong");
    }

}
