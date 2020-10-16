package Demo2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        HashMap<String, String>map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","3");
        map.put("e","3");
        map.put("f","3");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String>entry : entries ) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
