package ArrayList;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("aa");  //布尔值判断添加动作成功与否
        System.out.println(list);
        System.out.println("成功与否：" + success);

        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

        String result = list.get(2);  //根据索引值执行查询动作
        System.out.println(result);

        String whoremove = list.remove(2);         //移除索引值为2的元素
        System.out.println("移除的是" + whoremove);
        System.out.println(list.get(2));

        //获取集合长度尺寸，即其中元素个数
        int size = list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
