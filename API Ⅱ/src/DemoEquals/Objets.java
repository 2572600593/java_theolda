package DemoEquals;

import java.util.Objects;

public class Objets {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "asa";
        boolean c = Objects.equals(s1,s2);
        System.out.println(c);
    }
}
