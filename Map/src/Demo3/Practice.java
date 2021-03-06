package Demo3;

import java.util.HashMap;
import java.util.Scanner;

/*
    需求:
    计算一个字符串中每个字符出现次数。

    分析:
    1.  获取一个字符串对象
    2.  创建一个Map集合，键代表字符，值代表次数。
    3.  遍历字符串得到每个字符。
    4.  判断Map中是否有该键。
    5.  如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
    6.  打印最终结果
 */
public class Practice {
    public static void main(String[] args) {

        System.out.println("输入字符串：");
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    public static void findChar(String line) {
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i = 0;i < line.length();i++) {
            char c = line.charAt(i);  // 获取字符
            // 插入集合中的键值对：键表示字母，值表示出现次数
            if(!map.containsKey(c)) {  // 如果这个字母没出现过，即第一出现
                map.put(c, 1);
            }
            else {
                Integer cont = map.get(c);  // 获取已经出现的次数
                map.put(c, ++cont);
            }
        }
        System.out.println(map);
    }
}
