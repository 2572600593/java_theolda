package cn.package3;

public class DemoArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};

        for(int min = 0,max = arr2.length-1;min < max;min++,max--) {
            int t = arr2[min];
            arr2[min] = arr2[max];
            arr2[max] = t;
        }
        PrintArray(arr2);  // 调用方法
    }

    public static void PrintArray(int[] array) {
        for(int i =0;i < array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
