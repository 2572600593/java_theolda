package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    sort(List<T> list,Comparator<? super T>):将集合中的元素按照指定规则排序

    Comparable 和 Comparator区别
        Comparable:自己（this）和别人（参数）比较，实现Comparable，重写接口中的方法定义排序的规则。
        Comparator:找一个第三方的裁判比较
 */
public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            // 重写比赛的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;  // 升序
                return o2 - o1;  // 降序
            }
        });
        System.out.println(list);
    }
}
