package Demo1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
    Map集合的特点：
        1.双列集合，一个元素包含两个值（k,v）
        2.key和value 数据类型可以相同也可以不同
        3.key不允许重复，，value可以
        4.一个key对应一个value
    java.util.HashMap(k,v)集合 implements Map<k,v>接口
    HashMap集合的特点：
        1.Hashmap集合底层是哈希表，查询道速度块
        2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap(k,v)集合
    LinkedHashMap特点：
        1.LinkedHashmap集合底层是哈希表+链表
        2.LinkedHashMap集合是一个有序的集合
 */
public class Demo1 {
    public static void main(String[] args) {
/*        Map<String, String>map = new HashMap<>();  // 多态写法
        HashMap<String , String>map = new HashMap<>();

        String s1 = map.put("a","A");
        String s2 = map.put("b","B");
        String s3 = map.put("c","C");
        System.out.println(map);
*/
        show2();
    }

    public static void show1() {
        Map<String, String>map1 = new HashMap<>();

        String v1 = map1.put("a","A");
        System.out.println(v1);  // 没有重复元素，返回null

        String v2 = map1.put("a","B");  // 有重复的键，返回被他替代的值（A）
        System.out.println(v2);

        String v3 = map1.remove("a");
        System.out.println(v3);  // key存在，返回值；key不存在，返回null

        System.out.println(map1);  // 返回 a = B
    }
    public static void show2() {
        Map<String, Integer>map1 = new HashMap<>();

        Integer v1 = map1.put("a",1);
        System.out.println(v1);  // 没有重复元素，返回null

        Integer v2 = map1.put("a",2);  // 有重复的键，返回被他替代的值（1）
        System.out.println(v2);

        Integer v0 = map1.get("a");  // 键 a 对应的值为 2，故返回 2
        System.out.println(v0);

        Integer v3 = map1.remove(3);
        System.out.println(v3);  // key存在，返回值；key不存在，返回null

        System.out.println(map1);  // 返回 a = 2
    }

}
