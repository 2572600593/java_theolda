package DemoPackage;

public class DemoString {

    public static void main(String[] args) {

        // 基本类型 --> 字符串(String)
        int i = 100;
        String s1 = i + "";
        System.out.println(s1);  // 100

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);  // 100200

        String s3 = String.valueOf(100);
        System.out.println(s3 + 300);  // 100300

        // 字符串 --> 基本类型
        int i2 = Integer.parseInt(s1);  // 能将int类型的字符串转换为int
        System.out.println(i2);

//        int i3 = Integer.parseInt("a");
//        System.out.println(i3);
    }
}
