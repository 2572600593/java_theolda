package ArrayList;

import java.util.ArrayList;

public class DemoBasicData {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 不能存储基本数据类型
        ArrayList<Integer> list2 = new ArrayList<>();   //可以存储int的基本类型包装类
        list2.add(2);
        list2.add(5);
        System.out.println(list2);

        int num = list2.get(1);   // 自动拆箱：包装类型 --> 基本类型
        System.out.println(num);
    }
}


