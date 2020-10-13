package DemoHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add
        set.add(new String("a"));
        set.add("b");
        set.add("c");
        set.add("a");  // 不会被加入到集合中去
        for(String name : set) {
            System.out.println(name);
        }
    }
}
