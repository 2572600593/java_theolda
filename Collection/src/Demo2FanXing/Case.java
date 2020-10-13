package Demo2FanXing;

import java.util.ArrayList;
import java.util.Collections;

public class Case {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> pockets = new ArrayList<>();

        colors.add("a");
        colors.add("b");
        colors.add("c");
        colors.add("d");

        for(int i = 2;i <= 10;i++) {
            numbers.add(i + "");
        }
        numbers.add("j");
        numbers.add("q");
        numbers.add("k");
        numbers.add("a");
        for(String color : colors) {
            for(String number : numbers) {
                String card = color + number;
                pockets.add(card);
            }
        }
        pockets.add("small");
        pockets.add("big");
        Collections.shuffle(pockets);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();

        for(int i = 0;i < pockets.size();i++) {
            if(i >= 51) {
                rest.add(pockets.get(i));
            }
            else {
                if(i % 3 == 0) {
                    player1.add(pockets.get(i));
                }if(i % 3 == 1) {
                    player2.add(pockets.get(i));
                }if(i % 3 == 2) {
                    player3.add(pockets.get(i));
                }
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(rest);
    }
}
