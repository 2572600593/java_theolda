package Demo2;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("a");
            }
        }).start();

        // Lambda表达式
        /*
          标准格式由三部分组成：
            一些参数
            一个箭头
            一段代码
          格式：
            （参数列表） -> 重写方法的代码
         */
        new Thread(() ->  System.out.println("b")).start();  // 横式
        new Thread(() ->  {  // 竖式
            System.out.println("b");
        }).start();
    }

}
