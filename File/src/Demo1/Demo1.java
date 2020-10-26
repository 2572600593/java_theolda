package Demo1;

import java.io.File;

/*
    java.io.File类
    文件和目录路径名的抽象表示方式
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        static String pathSeparator 与系统有关的路径分隔符

        static String separator 与系统有关的默认名称
     */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  // 路径分隔符  window 分号;  linux 冒号:

        String separator = File.separator;
        System.out.println(separator);  // 文件名称分隔符  windows 反斜杠\   linux 正斜杠/
    }
}
