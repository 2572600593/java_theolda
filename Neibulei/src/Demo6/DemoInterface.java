package Demo6;

import java.util.ArrayList;
import java.util.List;  // ArrayList 实现的接口

public class DemoInterface {

    public static void main(String[] args) {
        // 多态写法
        List<String> list = new ArrayList<>();

        List<String>result = addName(list);
        for(int i = 0;i < result.size();i++) {  // 集合的遍历
            System.out.print(result.get(i));
        }
    }

    // 定义方法，用接口类型List作为返回值是可以的
    public static List<String> addName(List<String> list) {
        list.add("aa");
        return list;
    }
}
