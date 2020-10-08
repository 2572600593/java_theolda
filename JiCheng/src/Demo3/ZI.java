package Demo3;

public class ZI extends FU {

    int num = 20;

    public void methodzi() {
        int num = 30;
        System.out.println(num);       //局部变量
        System.out.println(this.num);  //本类中的num
        System.out.println(super.num); //父类中的num
    }

}
