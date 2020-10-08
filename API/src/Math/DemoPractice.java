package Math;

public class DemoPractice {

    public static void main(String[] args) {
        int cnt = 0;
        double min = -10.8;
        double max = 5.9;
        double Min = Math.ceil(min);
        double Max = Math.floor(max);
        System.out.println(Max + " " +  Min);
        for(double i = Min;i <= Max;i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

}
