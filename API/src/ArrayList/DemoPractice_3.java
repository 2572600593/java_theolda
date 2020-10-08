package ArrayList;
/*
定义以指定格式打印集合的方法(ArrayList类型作为参数)，
使用 {} 扩起集合，使用 @ 分隔每个元素。格式参照 {元素@元素@元素}。
 */

import java.util.ArrayList;

public class DemoPractice_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{ ");
        for(int i = 0;i < list.size();i++) {
            System.out.print(list.get(i));

            if(i != list.size() - 1) {
                System.out.print(" @ ");
            }
        }
        System.out.print(" }");
    }
}
