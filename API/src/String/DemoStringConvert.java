package String;

//public String replace(CharSequence oldString,CharSequence newString)
//CharSequence意思时可以接受字符串类型。

public class DemoStringConvert {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] chars = str1.toCharArray(); //转换成字符数组
        System.out.println(chars[0]);

        byte[] bytes = "abc".getBytes();  //转换成字节数组
        for(int i = 0;i < bytes.length;i++) {
            System.out.println(bytes[i]);
        }

        String str2 = "How do you do";  //替换特定字符
        String str3 = str2.replace("o","*");  // 用 * 替代 o
        System.out.println(str3);

        String lang1 = "啊，你大爷的！";
        String lang2 = lang1.replace("你大爷的","****");
        System.out.println(lang2);
    }
}
