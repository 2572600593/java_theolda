package Demo1;

import java.util.ArrayList;
import java.util.List;

public class SomeExceptions {
    public static void main(String[] args) {
        int[] arrayA = new int[2];
        ArrayList<Integer> list01 = new ArrayList<>();
        //多次捕获，多次处理
        try {
            System.out.println(arrayA[3]);//ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println(list01.get(4));//IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("=========================================");
        //一次捕获，多次处理
        try{
            System.out.println(list01.get(4));//IndexOutOfBoundsException
            System.out.println(arrayA[3]);//ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("=========================================");
        //一次捕获，一次处理
        try{
            System.out.println(list01.get(4));//IndexOutOfBoundsException
            System.out.println(arrayA[3]);//ArrayIndexOutOfBoundsException
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
