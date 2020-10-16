package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoStudentCollections {
    public static void main(String[] args) {
        ArrayList<Student_Comparator> list = new ArrayList<>();
        list.add(new Student_Comparator("a",3));  // 匿名对象
        list.add(new Student_Comparator("b",1));
        list.add(new Student_Comparator("c",2));
        list.add(new Student_Comparator("a",2));
        System.out.println(list);

       /* Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 不能直接用 o1 - o2
                return o1.getAge() - o2.getAge();  // 按照年龄升序排列
            }
        });*/
        Collections.sort(list, new Comparator<Student_Comparator>() {
            @Override
            public int compare(Student_Comparator o1, Student_Comparator o2) {
                // 不能直接用 o1 - o2
                int result = o1.getAge() - o2.getAge();  // 按照年龄升序排列
                // 接收年龄差，若年龄相同则用姓名的首字母排序
                if(result == 0) {
//                    charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);  // 取首字母进行比较
                }
                return result;
            }
        });

        System.out.println(list);
    }
}
