package Demo7;

import red.OpenMode;

/*红包种类
    1.普通红包（平均）：totalMoney / totalCount
    2.手气红包（随机）:最少一分

需要做：
    1.设置程序标题，通过构造方法的字符串参数
    2.设置群主名称
    3.设置分发策略
 */
public class Bootstrap {  // 项目启动

    public static void main(String[] args) {
        MyRed red = new MyRed("专属红包");

        // 设置群主名称
        red.setOwnerName("王思聪");

        // 设置分发策略
        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);
        // 手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
