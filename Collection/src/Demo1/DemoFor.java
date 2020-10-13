package Demo1;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强 for:
      for(int a : array) { }
 */
public class DemoFor {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int a : arr) {  // 遍历数组
            System.out.println(a);
        }
        Collection<String> coll = new ArrayList<>();
        coll.add("12");
        coll.add("asd");
        for(String s : coll) {  // 遍历集合
            System.out.println(s);
        }
    }
}
