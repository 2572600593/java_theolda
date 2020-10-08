package cn.package3;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str = toString(array);
        System.out.println(str);
    }

    public static String toString(int[] array) {
        String str = "{";
        for(int i = 0;i < array.length;i++) {
            str += "word" + array[i];
            if(i < array.length - 1) {
                str += "#";
            }
            if(i == array.length - 1) {
                str += "}";
            }
        }
        return str;
    }
}
