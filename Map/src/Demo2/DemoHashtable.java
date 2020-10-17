package Demo2;

import java.util.HashMap;
import java.util.Map;

/*  java.util.Hashtable<K,V>集合
    Hashtable:底层是哈希表，线程安全，单线程集合，速度慢
    HashMap：底层是一个哈希表，线程不安全，多线程集合，速度快
 */
public class DemoHashtable {
    public static void main(String[] args) {
        HashMap<String, String>map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        Map<String, String>map1 = Map.of("null","a","b","null");
        System.out.println(map);  // 结果为：{null=null, b=null}
                                  // 说明HashMap集合可以存储 null
        System.out.println(map1);  // 不可nulll
    }
}
