package cn.package3;
/*
数组

初始化方式
1.静态(内容)
2.动态(长度)

数据类型[] 数据名称 = new 数据类型[数组长度];

*/

public class DemoArray {
    public static void main(String[] args){
         int[] Array1 = new int[10];

         double[] Array2 = new double[15];

         String[] Array3 = new String[10];

         int[] Array4 = new int[] {5,15,25};

         String[] Array5 = new String[] {"world","java"};
         String[] Array6 = {"python"}; //省略
        //静态初始化的省略步骤 不能拆分成两个步骤

         int[] Array7;
         Array7 = new int[15];

         String[] ids;
         ids = new String [] {"ma"};

    }
}
