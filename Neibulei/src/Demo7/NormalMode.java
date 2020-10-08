package Demo7;

import red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;  // 平均值
        int mod = totalMoney % totalCount;  // 模

        for(int i = 0;i < totalCount - 1;i++) {   // 最后一个数先留着
            list.add(avg);
        }

        list.add(avg + mod);  // 零头放入最后一个红包中
        return list;
    }
}
