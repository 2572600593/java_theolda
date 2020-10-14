package DemoLinkedHashSet;

public class DemoVarArgs {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,77};
        String name = "a";
        double b;
        int sum1 = Gets0(arr);
        System.out.println(sum1);
        int sum2 = Gets0(1,2,3,4);  // 可有随意改变长度
        Gets1(name,1.2,1,2,3,4,5);
        method("a",1,2,1.2);
    }

    public static int Gets0(int...arr) {
        int sum = 0;
        for(int a : arr) {  // 用增强for遍历
            sum += a;
        }
        return sum;
    }

    public static void Gets1(String name, double b, int...arr) {
        System.out.println(name + b);
        for(int a : arr) {  // 用增强for遍历
            System.out.println(a);
        }
    }

    //可变参数特殊写法(Finally)
    public static void method(Object...obj) {
        for(Object o : obj) {  // 用增强for遍历
            System.out.println(o);
        }
    }
}
