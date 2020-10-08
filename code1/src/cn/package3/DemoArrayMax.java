package cn.package3;

public class DemoArrayMax {
    public static void main(String[] args) {
        int[] arr1 = {5,10,15,20,25,30,35,40};
        int max = arr1[0];
        int len = arr1.length;
        for(int i=1;i < len;i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}
