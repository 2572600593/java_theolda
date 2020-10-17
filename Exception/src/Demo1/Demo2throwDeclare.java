package Demo1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2throwDeclare {

    // 方法后面throw跟的是可能会b'b用到的异常
    public static void main(String[] args) throws IOException {
        read("b.txt");
    }

    public static void read(String path) throws IOException {
        if(!path.equals("a.txt")) {
            // 如果文件路径不匹配
            throw new FileNotFoundException("文件路径错误");
        }
        if(!path.equals("b.txt")) {
            throw new IOException();
        }
    }
}
