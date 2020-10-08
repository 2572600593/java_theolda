package cn.package3;

// 访问数组元素


public class DemoArrayUse {
    public static void main(String[] args) {

        int[] Arr1 = {10,15,20};  //静态
        System.out.println(Arr1[2]);

        int[] Arr2 = new int[3];  //动态
        Arr2[1] = 21;
        System.out.println(Arr2[1]);

        // Arr3的地址同Arr2相同，改变Arr3[1]的值会使Arr2[1]发生相同的变化
        int[] Arr3 = Arr2;
        Arr3[1] = 42;
        System.out.println(Arr3[1]);
        System.out.println("New Arr2 = " + Arr2[1]);

        // 数组长度
        int[] arr1;
        arr1 = new int[] {1,2,3,4,5,6,7,8,9};
        int len = arr1.length;
        System.out.println(len);

        // 数组遍历
        int[] arr2 = new int[] {1,2,3,4,5,6,7};
        for(int i = 0;i < 5;i++) {
            System.out.println(arr2[i]);
        }
    }
}
