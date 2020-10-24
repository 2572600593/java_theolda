package Demo3;


import java.util.Comparator;

/*
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
//        使用数组存储多个Person对象
        Person[] arr = {
                new Person("c",3),
                new Person("d",4),
                new Person("a",1),
                new Person("b",2),
        };

//        使用匿名内部类，对数组中的Person对象使用Array中的sort方法进行升序排序
  /*      Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();  // 升序
            }
        });*/

        // 使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        for(Person p : arr) {
            System.out.println(p);
        }
    }
}











