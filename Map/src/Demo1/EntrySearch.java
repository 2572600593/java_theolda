package Demo1;

// 遍历集合（使用Entry对象）

//  Entry将键值对的对应关系封装成了对象。即键值对对象
/*
    Entry表示了一对键和值，那么也同样提供了获取对应键和对应值得方法：
    public K getKey()：获取Entry对象中的键。
    public V getValue()：获取Entry对象中的值。

    在Map集合中也提供了获取所有Entry对象的方法：
    public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.  获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:entrySet()。

    2.  遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
    3.  通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:getKey() getValue()
 */
public class EntrySearch {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");

        Set<Map.Entry<String, String>> entry = map.entrySet();
        for(Map.Entry<String, String> e : entry) {
            String key = e.getKey();
            String value = e.getValue();
        }
    }
}
