package Demo1;

import java.io.File;
public class Demo2 {
    public static void main(String[] args) {
        // File的构造方法
        show1(); show2(); show3();
    }

    public static void show1() {
        // File(String pathname)
        File f1 = new File("E:\\BaiduNetdiskDownload\\1-8 File类与IO流");
        System.out.println(f1);  // 重写了toString方法
    }

    public static void show2() {
        // File(String parent, String child)  根据父路径和子路径创建一个新的File实例
        File f2 = new File("E:\\BaiduNetdiskDownload","1-8 File类与IO流");
        System.out.println(f2);
    }

    public static void show3() {
        // File(File parent, String child)  父路径是File类型，可以使用File的方法进行一些操作，再使用路径创建对象
        File parent = new File("E:\\BaiduNetdiskDownload");
        File f3 = new File(parent, "1-8 File类与IO流");
        System.out.println(f3);
    }
}
