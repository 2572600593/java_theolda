package Demo1;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1Method {

    public static void main(String[] args) {
        // 使用多态形式创建集合对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);  // []

        // boolean add(E e): 把给定的对象添加到当前的集合中
        boolean b1 = coll.add("zd");
        boolean b2 = coll.add("123");
        System.out.println(b1);
        System.out.println(coll);

        // boolean contains(E e): 判断当前集合是否包含给定元素
        System.out.println("123456789" + coll.contains("123"));

        // boolean remove(E e): 删除在集合中的某元素(整个元素，不能使元素的一部分)
        // 删除成功返回”true“，反之”false“
        System.out.println(coll.remove("12"));
        System.out.println(coll);

        // size() 集合元素个数
        System.out.println(coll.size());

        // Object[] toArray(): 把集合中的元素，存储道数组中
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        coll.clear();
        coll.isEmpty();
    }
}

