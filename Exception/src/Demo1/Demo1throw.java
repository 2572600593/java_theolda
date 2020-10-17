package Demo1;

// Java异常处理的五个关键字：try、catch、finally、throw、throws
public class Demo1throw {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int re = getElement(arr,4);
    }

    public static int getElement(int a[],int index) {
        if(index > 3 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        return a[index];
    }
/*
    最后输出为：
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 数组越界
	    at Demo1.Demo1.getElement(Demo1.java:25)
	    at Demo1.Demo1.main(Demo1.java:10)
 */
}
