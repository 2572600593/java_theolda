package cn.package3;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bigwords = 0,smallwords = 0,nums = 0,others = 0;
        byte[] byte1 = str.getBytes();
        for(int i = 0;i < byte1.length;i++) {
            int i1,i2,i3;
            if(byte1[i] >= '0' && byte1[i] <= '9') {
                nums++;
            }
            else if(byte1[i] >= 'A' && byte1[i] <= 'Z') {
                bigwords++;
            }
            else if(byte1[i] >= 'a' && byte1[i] <= 'z') {
                smallwords++;
            }
            else{
                others++;
            }
        }
        System.out.print(nums + " " +  bigwords + " " + smallwords + " " + others);
    }

}
