package Demo1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3TryCatch {
    public static void main(String[] args) throws IOException {
        try {
            read("d:\\a.txd");
        } catch(FileNotFoundException e) {
            System.out.println("文件名错误");
        } catch(IOException E) {
            System.out.println("后缀不是.txt");
        }
        System.out.println("over");
    }

    public static void read(String path) throws IOException {
        if(!path.endsWith(".txt")) {  // 获取后缀
            throw new IOException("后缀错误");
        }
        System.out.println("后缀正确");
    }
}
