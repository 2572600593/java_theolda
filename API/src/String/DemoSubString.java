package String;

/*
字符串的截取方法：

public

 */

public class DemoSubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);  // World

        String str3 = str1.substring(5,7);  //左闭右开 [5,7)
        System.out.println(str3);  // Wo


        //下面两中写法字符串str中保存的内容没有发生改变，改变的是字符串中存的的地址值
        //即从 "aa" 的地址变为 ”java“ 的地址
        String str4 = "aa";
        System.out.println(str4);
        str4 = "java";
        System.out.println(str4);
    }
}
