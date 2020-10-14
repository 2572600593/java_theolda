package DemoHashSet;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = "cc";
        set.add(s1);
        set.add(s2);
        set.add("abc");
        System.out.println(set);
    }
}
