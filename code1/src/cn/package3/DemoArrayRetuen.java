package cn.package3;

/*
一个方法可以有0、1、多个参数，但是只能有0或者1个返回值，不能有多个返回值
如果希望对一个方法中产生的多个数据结果进行返回，应该使用一个数组作为返回值类型
*/
public class DemoArrayRetuen {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println(result[0] + " "+ result[1]);
    }

    public static int[] calculate(int a,int b,int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] arr = {sum,avg};
        return arr;
    }
}
