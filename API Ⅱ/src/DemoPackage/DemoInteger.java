package DemoPackage;

/*
    装箱：从基本类型转换为对应的包装类对象。
 */

public class DemoInteger {

    public static void main(DemoString[] args) {
        // 装箱：基本数值-->包装对象
        Integer i = new Integer(4);  // 使用构造函数
        System.out.println(i);

        Integer ii = Integer.valueOf(1);  // 包装类中的valueOf方法
        System.out.println(ii);

        /// 拆箱：包装类型-->基本类型
        int num = i.intValue();
        System.out.println(num);
    }
}
