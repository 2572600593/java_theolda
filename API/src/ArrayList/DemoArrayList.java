package ArrayList;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
//        创建了一个ArrayList集合，集合名称是list，里面装的全都是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //添加数据，add
        list.add("1");
        list.add("2");
//        list.add(100)   //错误写法，因为泛型尖括号已经声明是String类型
        System.out.println(list);   //输出类似python的list
    }
}


