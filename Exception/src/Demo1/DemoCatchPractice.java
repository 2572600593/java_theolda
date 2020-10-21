package Demo1;

import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;

public class DemoCatchPractice {


    public static void main(String[] args) {
        int[] a = {2,3};
        ArrayList<String>list = new ArrayList<>(List.of("a","b"));

        // 一次捕获 一次处理
        try {
            System.out.println(a[3]);
            System.out.println(list.get(4));
        } catch (Exception e) {
            System.out.println("异常");
        }

        // 一次捕获，多次处理
        try {
//            System.out.println(a[3]);
            System.out.println(list.get(4));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
