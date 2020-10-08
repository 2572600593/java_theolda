package cn.package2;
/*
1
比较两个数据是否相等
参数类型：两个byte，两个short，两个int，两个long

2
println 的重载
*/
public class OverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame(10,10));
        System.out.println(isSame((short) 10, (short) 20));

        Println(10);
        Println("abc");

    }

    public static void Println(int num) {
        System.out.println(num);
    }

    public static void Println(String str) {
        System.out.println(str);
    }

    public static boolean isSame(byte a,byte b) {
        System.out.println("BYTE");
        boolean same;
        if(a == b) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isSame(short a,short b) {
        System.out.println("SHORT");
        return a == b;
    }

    public static boolean isSame(int a,int b) {
        System.out.println("INT");
        boolean result;
        result = a == b ? true : false;
        return result;
    }
}
