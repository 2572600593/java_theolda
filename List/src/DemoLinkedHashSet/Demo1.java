package DemoLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    LinkedHashSet元 素唯一且有序
    哈希表（数组 + 链表/红黑树） + 链表
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("aa");
        set.add("ab");
        set.add("ac");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());  // 按照输入顺序 输出
        }
    }
}
