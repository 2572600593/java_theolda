package cn.package4;

import java.util.Arrays;

public class DemoPrintArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        //要求打印格式为：[10,20,30,40,50]
        //使用面向过程
        System.out.print("[");
        int i;
        for(i = 0;i < arr.length-1;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i] + "]");
        System.out.println("=============");

        //使用面向对象
        System.out.println(Arrays.toString(arr));
    }
}
