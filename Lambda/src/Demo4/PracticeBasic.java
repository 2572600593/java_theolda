package Demo4;

// 使用Lambda的标准格式调用invokeCalc方法，完成10和20的相加计算
public class PracticeBasic {
    public static void main(String[] args) {
        // 调用invokeCale方法，方法的参数是一个接口，可以使用匿名内部类
        invokeCale(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        // 使用Lambda表达式简化匿名内部类的书写
        invokeCale(10,20,(int a,int b) -> {
            return a + b;
        });
    }
    /*
        定义一个方法invokeCale
        参数传递两个int类型的整数,
        参数传递Calculator接口,
        方法内部调用Calculator方法中的方法calc计算两个整数的和
    */
    public static void invokeCale(int a, int b, Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
