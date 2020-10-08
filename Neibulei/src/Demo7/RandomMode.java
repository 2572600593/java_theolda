package Demo7;

import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // 随机分配
        // 最少1分，最多不超过剩下金额的2倍

//        金额生成范围的[公式]：1 + random.nextInt(leftMoney / leftCount * 2);
        Random r = new Random();  // 随机数生成器
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for(int i = 0;i < totalCount - 1;i++) {  // 最后一个不用随机
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;  // +1保证至少1分钱
            list.add(money);  // 将金额加入到list集合中
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
