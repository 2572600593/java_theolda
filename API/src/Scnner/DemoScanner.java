package Scnner;

import java.util.Scanner; //1.导包
/*
        Scanner类的功能，可以试先键盘输入数据，到程序中。

        引用类型一般使用步骤

        1.导包
        import包路径.类名称
        如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句
        只有java.lang包下的的内容不需要导包，其他包都需要import导包

        2.创建
        类名称对象名=new类名称();

        3.使用
        对象名。成员方法名()

        获取键盘输入的一个int数字：intnum=sc.nextInt();
        获取键盘输入的一个字符串：Stringstr=sc.next();
*/
public class DemoScanner {
    public static void main(String[] args) {
        //2.创建
        // 备注：System.in 代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //3.获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("你的输入为：" + num);

        //4.获取键盘输入的String字符串
        String str = sc.next();
        System.out.println("你的输入为: " + str);
    }
}

