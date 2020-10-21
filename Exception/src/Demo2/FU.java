package Demo2;

// 子父类异常

public class FU {
    public void show1() throws NullPointerException,ClassCastException{}
    public void show2() throws IndexOutOfBoundsException{}
    public void show3() throws IndexOutOfBoundsException{}
    public void show4() {}
}

class ZI extends FU {
    // 子类重写父类方法，抛出和父类相同的异常
    public void show1() throws NullPointerException{}
    // 子类重写父类方法，抛出父类异常的子类
    public void show2() throws ArrayIndexOutOfBoundsException{}
    // 子类重写父类方法，不抛出异常
    public void show3() {}
    // 父类没有抛出异常，子类也不能抛出异常
}
