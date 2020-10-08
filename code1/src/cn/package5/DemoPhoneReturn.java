package cn.package5;

// 返回值
public class DemoPhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
    }
    public static Phone getPhone() {  //这里的Phone是为了与return的返回值类型相同
        Phone one = new Phone();
        one.brand = "MI";
        one.price = 3888.0;
        one.color = "Blank";
        return one;
    }
}
