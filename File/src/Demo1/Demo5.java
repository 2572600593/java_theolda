package Demo1;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File f1 = new File("E:\\BaiduNetdiskDownload\\ppt\\中国风ppt模板\\中国风ppt模板\\第一部分");
        String arr[] = f1.list();
        for(String filename : arr) {
            System.out.println(filename);
        }
        File[] file = f1.listFiles();
        for(File filename : file) {
            System.out.println(filename);
        }
    }
}