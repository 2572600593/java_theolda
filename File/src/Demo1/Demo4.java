package Demo1;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        show3();
    }

    public static void show1() {
        File f1 = new File("E:\\BaiduNetdiskDownload\\1-8 File类与IO流");
        System.out.println(f1.exists());

        File f2 = new File("1-8 File类与IO流");
        System.out.println(f1.exists());

        // 路径必须存在，才能判断
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
    }

    public static void show2() throws IOException {
        File f1 = new File("E:\\BaiduNetdiskDownload\\1-8 File类与IO流");
        boolean b1 = f1.createNewFile();  // true:文件不存在，创建文件
        System.out.println(b1);
    }

    public static void show3() {
        File f2 = new File("E:\\BaiduNetdiskDownload\\1-8 File类与IO流");
        boolean b1 = f2.mkdir();
        System.out.println(b1);

        File f3 = new File("E:\\BaiduNetdiskDownload\\2015");
        System.out.println(f3.delete());

    }
}
