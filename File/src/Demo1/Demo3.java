package Demo1;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        show1(); show2(); show3();
    }

    public static void show1() {
        // public String getAbsolutePath():返回File的绝对路径
        File f1 = new File("1-8 File类与IO流");
        String AbsolutePath = f1.getAbsolutePath();
        System.out.println(AbsolutePath);
    }

    public static void show2() {
        // public String getPath():返回File的路径
        File f2 = new File("1-8 File类与IO流");
        System.out.println(f2.getPath());
    }

    public static void show3() {
        File f3 = new File("E:\\BaiduNetdiskDownload");
        System.out.println(f3.length());
    }
}
