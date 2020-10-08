package ArrayList;

/*
题目：
定义一个数组，用来存储3个Person对象

数组有一个缺点
一旦创建，程序运行当中长度不可改变
 */
public class DemoArrray {
    public static void main(String[] args) {
//        int[] arr = new int[3];
        Person[] arr = new Person[3]; //形式参考int

        Person one = new Person("ab",12);
        Person two = new Person("cc",21);
        Person three = new Person("tt",38);

        arr[0] = one;  //将one中的地址值赋值到数组的 0号元素位置
        arr[1] = two;
        arr[2] = three;

        System.out.println(one.getAge());    //  12
        System.out.println(arr[0].getAge()); // 也是12
    }
}


