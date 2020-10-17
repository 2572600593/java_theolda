package Demo3;

import java.util.*;

public class PracticeCards {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();  // 序号 + 牌号
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        // 存储花色和数字
        Collections.addAll(colors,"♦", "♣", "♥", "♠");
        Collections.addAll(numbers,"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int cont = 1;
        map.put(cont++, "大王");
        map.put(cont++, "小王");
        // 创建牌，（编号 + 牌）存储到集合
        for(String color : colors) {
            for(String number : numbers) {
                String card = color + number;
                map.put(cont++, card);
            }
        }
        // 取出编号，打乱顺序
        Set<Integer>id = map.keySet();  // 取出编号
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(id);  // 用 addAll 将集合中元素全转移到list集合，因为Collections的shuffle需要list
        Collections.shuffle(list);  // 乱序

        // 摸牌，创建玩家集合及地主牌集合,用来存储牌的编号
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();

        for(int i = 0;i < list.size();i++) {
            int a = list.get(i);  // 根据键，获取值
            // 除了3张地主牌之外的牌
            if(i < 51) {
                if(i % 3 == 0) {
                    player1.add(a);
                }
                else if(i % 3 == 1) {
                    player2.add(a);
                }
                else if(i % 3 == 2) {
                    player3.add(a);
                }
            }
            else {
                rest.add(a);
            }
        }

        // 将每个人的牌都排好序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(rest);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> re = new ArrayList<>();

        // 牌面切换：根据编号找到card
        for(Integer number1 : player1) {
//            String t = map.get(number1);
//            p1.add(t);
            p1.add(map.get(number1));
        }
        for(Integer number2 : player2) {
            p2.add(map.get(number2));
        }
        for(Integer number3 : player3) {
            p3.add(map.get(number3));
        }
        for(Integer number4: rest) {
            re.add(map.get(number4));
        }
        // 至此，p1,p2,p3,re中存储的是随机的卡牌

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(re);
    }
}
