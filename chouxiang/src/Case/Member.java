package Case;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从红包集合中随便抽取获取索引编号
        int index = new Random().nextInt(list.size());
        int dalta = list.remove(index); // 从集合中删除红包（根据索引）
        // 当前成员自己本来有多少钱
        int money = super.getMoney();
        // 加法，重新设置回去
        super.setMoney(money + dalta);
    }
}
