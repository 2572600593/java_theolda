package Arrays;

import java.util.Arrays;

public class DemoPractice {

    public static void main(String[] args) {
        String line = "asdqAERAdaSVJokpovm";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for(int i = chars.length - 1;i >= 0;i--) {
            System.out.print(chars[i]);
        }

    }

}
