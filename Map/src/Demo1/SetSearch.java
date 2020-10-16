package Demo1;

import java.util.HashMap;
import java.util.Set;

// 遍历键值
public class SetSearch {
    public static void main(String[] args) {

        HashMap<String, String>map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");

        // 设立集合，获取并存储健值 (使用keySet)
        Set<String> keys = map.keySet();
        for(String key : keys) {  // 增强for遍历
            // 获取值
            String value = map.get(key);  // 获取键所对应的值
            System.out.println(key +"-"+value);
        }
    }
}
