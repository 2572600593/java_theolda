package cn.package3;

/*
切割字符串
 */

public class DemoSplit {
    public static void main(String[] args) {
        String str1 = "abc,def,gh";
        String array[] = str1.split(","); //将分割出来的字符串装进数组
        System.out.println(array[0]);

        String str2 = "abc.def.gh"; // 英文句点
//        用'.'进行切分，必须写"\\."
        String array2[] = str2.split("\\.");
        System.out.println(array2[0]);
    }
}
