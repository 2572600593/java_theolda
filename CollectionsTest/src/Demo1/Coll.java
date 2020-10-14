package Demo1;

import java.util.ArrayList;
import java.util.Collections;

public class Coll {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("a",1);
        list.add(p1);
        list.add(new Person("b",2));
        Collections.sort(list);
        System.out.println(list);
    }
}
