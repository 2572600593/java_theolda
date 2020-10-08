package String;


public class DemoStringGet {
    public static void main(String[] args) {
        int length = "aaaaaaaa".length();

        String str1 = "123 ";
        String str2 = "456";
        String str3 = str2.concat(str1);
        System.out.println(str3);

        // 获取指定索引位置的单个字符
        String str4 = "helloworld";
        char c = str4.charAt(4);
        System.out.println(c);

        //查询参数字符串在本来字符串当中出现的第一次索引位置； 如果没有，返回 -1
        String organal = "HelloWorld";
        String search = "llo";
        int index = organal.indexOf(search);
        System.out.println(index);
    }
}
