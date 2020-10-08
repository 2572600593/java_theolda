package Case;
import java.util.ArrayList;

// 群主的类
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合，用来储存若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主自己有多少钱
        int leftMoney = super.getMoney(); // 群主当前余额
        if(totalMoney > leftMoney) {
            System.out.println("余额不足");
            return null;
        }

        // 重新设置余额
        super.setMoney(leftMoney - totalMoney);

        // 发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;   //除不开的零头，包在最后一个红包中

        for(int i = 0;i < count; i++) {
            if(i == count - 1)
                redList.add(avg + mod);
            else
                redList.add(avg);
        }
        return redList;
    }
}
