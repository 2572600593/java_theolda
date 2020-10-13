package DemoList;

import java.util.LinkedList;

// LinkedList 集合
public class Demo1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("la");
        list.push("push");
        System.out.println(list);
        while(!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
