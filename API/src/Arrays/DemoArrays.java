package Arrays;

import java.util.Arrays;

/*
 toString   int[] arr = {1,2,3};
            String str = Arrays.toString(arr);
 sort       Arrays.sort(arr);
*/

public class DemoArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = Arrays.toString(arr);
        System.out.println(str);

        int[] arr2 = {1,2,3,5,8,4,7,9};
        Arrays.sort(arr2);
        String str2 = Arrays.toString(arr2);
        System.out.println(str2);

        String[] arr3 = {"aa","bb","cc","dd"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

}
