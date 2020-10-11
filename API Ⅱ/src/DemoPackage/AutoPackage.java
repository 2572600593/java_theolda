package DemoPackage;

// 自动装箱，自动拆箱

import java.util.ArrayList;

public class AutoPackage {

    public static void main(DemoString[] args) {
        Integer i = 4;  // 自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5;  // 等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
        // 加法运算完成后，再次装箱，把基本数值转成对象。

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int a = list.get(1);

    }
}
