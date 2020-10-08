package ArrayList;

/*
生成6个1~33之间的随机整数,添加到集合,并遍历
 */
import java.util.Random;
import java.util.ArrayList;

public class DemoPractice_1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        for(int i=0;i<6;i++) {
            num = r.nextInt(33) + 1;   // 范围定在1~33
            list.add(num);
        }
        for(int i=0;i<6;i++) {
            System.out.println(list.get(i));
        }
    }
}
