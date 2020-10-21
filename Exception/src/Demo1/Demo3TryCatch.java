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
        } catch(IOException e) {
            System.out.println("后缀不是.txt");
            System.out.println(e.getMessage());  // 后缀错误
            System.out.println(e.toString());  // java.io.IOException: 后缀错误
            e.printStackTrace();  // 会在程序末尾 输出详细的错误信息
        } finally {
            System.out.println("finally后的语句必定执行");
        }
        System.out.println("over");
    }

    public static void read(String path) throws IOException {
        if(!path.endsWith(".txt")) {  // path.endsWith 获取后缀
            throw new IOException("后缀错误");
        }
        System.out.println("后缀正确");
    }
}
